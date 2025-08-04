package com.guarani.siuguarani.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.guarani.siuguarani.dtos.DTOAlumnoResponse;
import com.guarani.siuguarani.repositories.AlumnoRepository;
import com.guarani.siuguarani.models.Alumno;

@Service
public class AlumnoService {
    
    @Autowired
    private AlumnoRepository alumnoRepository;

    public DTOAlumnoResponse getAlumnoData(Long studentID) {
        Alumno alumno = alumnoRepository.findByStudentID(studentID);
        return alumno.toDTO();
    }

    public ResponseEntity<String> alumnoRegular(Long studentID) {
        DTOAlumnoResponse alumnoData = getAlumnoData(studentID);

        return ResponseEntity.ok("El alumno " + alumnoData.getNombre() + " " + alumnoData.getApellido() +
       ", nacido el " + alumnoData.getFechaNacimiento() +
       ", cursando la carrera de " + alumnoData.getCarrera() +
       ", con email " + alumnoData.getEmail() + ", es alumno regular.");
    }

    public String avanceCarrera(Long studentID) {
        // Implementar lógica para el informe de avance de carrera
        return "Anda el endpoint de informes avance carrera";
    }
    
}
