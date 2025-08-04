package com.guarani.siuguarani.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.guarani.siuguarani.dtos.DTOInscripcionMateria;
import com.guarani.siuguarani.enums.EstadoEnum;
import com.guarani.siuguarani.models.Alumno;
import com.guarani.siuguarani.models.Correlativa;
import com.guarani.siuguarani.repositories.AlumnoRepository;
import com.guarani.siuguarani.repositories.CorrelativaRepository;
import com.guarani.siuguarani.repositories.InscripcionMateriaRepository;
import com.guarani.siuguarani.repositories.MateriaRepository;
import com.guarani.siuguarani.models.InscripcionMateria;
import com.guarani.siuguarani.models.Materia;
@Service
public class MateriaService {


    @Autowired
    private InscripcionMateriaRepository inscripcionMateriaRepository;
    @Autowired
    private AlumnoRepository alumnoRepository;
    @Autowired
    private MateriaRepository materiaRepository;
    @Autowired
    private CorrelativaRepository correlativaRepository;

    public ResponseEntity<List<DTOInscripcionMateria>> listarMateriasPorAlumno(Long studentID) {
        Alumno alumno = alumnoRepository.findByStudentID(studentID); 

        List <InscripcionMateria> materias = inscripcionMateriaRepository.findByAlumno(alumno);

        return ResponseEntity.ok(materias.stream()
            .map(inscripcion -> new DTOInscripcionMateria(inscripcion.getNota(), inscripcion.getMateria(), inscripcion.getEstado()))
            .collect(Collectors.toList()));

        
    }
    public ResponseEntity<List<Materia>> listarMaterias(){
        List <Materia> materias = materiaRepository.findAll();
        return ResponseEntity.ok(materias);
    }   

    public ResponseEntity<DTOInscripcionMateria> inscribirMateria(Long studentID, Long materiaID){
        
        InscripcionMateria inscripcion = new InscripcionMateria();
        Alumno alumno = alumnoRepository.findByStudentID(studentID);
        Materia materia = materiaRepository.findById(materiaID).get(); // .get por el Optional

        if(verificarCorrelativa(alumno, materia)){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null); // example para gestionar errores
        }
        
        Optional<InscripcionMateria> existente = inscripcionMateriaRepository.findByAlumnoAndMateria(alumno, materia);
        if(existente.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null); // example para gestionar errores
        }
        
        inscripcion.setAlumno(alumno);
        inscripcion.setNota(0);
        inscripcion.setMateria(materia);
        inscripcion.setEstado(EstadoEnum.EN_CURSO);

        return ResponseEntity.ok(inscripcionMateriaRepository.save(inscripcion).toDTO());

        
    }

    private boolean verificarCorrelativa(Alumno alumno, Materia materia){
        List<Correlativa> correlativas = correlativaRepository.findByMateria(materia);

        for(Correlativa c : correlativas){
            Materia materiaCorrelativa = c.getCorrelativa();

            Optional<InscripcionMateria> inscripto = inscripcionMateriaRepository.findByAlumnoAndMateria(alumno, materiaCorrelativa);
            if( inscripto.isEmpty() || inscripto.get().getEstado() != EstadoEnum.APROBADO){
                return true;
            }
        }
        return false;
    }
}
