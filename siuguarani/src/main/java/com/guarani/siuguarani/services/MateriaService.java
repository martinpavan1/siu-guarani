package com.guarani.siuguarani.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guarani.siuguarani.dtos.DTOInscripcionMateria;
import com.guarani.siuguarani.enums.EstadoEnum;
import com.guarani.siuguarani.models.Alumno;
import com.guarani.siuguarani.repositories.AlumnoRepository;
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

    public List<DTOInscripcionMateria> listarMateriasPorAlumno(Long studentID) {
        Alumno alumno = alumnoRepository.findByStudentID(studentID); 

        List <InscripcionMateria> materias = inscripcionMateriaRepository.findByAlumno(alumno);

        return materias.stream()
            .map(inscripcion -> new DTOInscripcionMateria(inscripcion.getNota(), inscripcion.getMateria(), inscripcion.getEstado()))
            .collect(Collectors.toList());
    }

    public DTOInscripcionMateria inscribirMateria(Long studentID, Long materiaID){
        
        InscripcionMateria inscripcion = new InscripcionMateria();
        Alumno alumno = alumnoRepository.findByStudentID(studentID);
        Materia materia = materiaRepository.findById(materiaID).get(); // .get por el Optional
        
        inscripcion.setAlumno(alumno);
        inscripcion.setNota(0);
        inscripcion.setMateria(materia);
        inscripcion.setEstado(EstadoEnum.EN_CURSO);

        return inscripcionMateriaRepository.save(inscripcion).toDTO();

        
    }
}
