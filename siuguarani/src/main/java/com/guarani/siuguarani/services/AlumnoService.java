package com.guarani.siuguarani.services;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
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
    public DTOAlumnoResponse actualizarAlumnoData(Long studentID, String nombre, String apellido, 
                                                    String email, Date fechaNacimiento){
                            
        Alumno alumno = alumnoRepository.findByStudentID(studentID);
        alumno.setNombre(nombre);
        alumno.setApellido(apellido);
        alumno.setEmail(email);
        alumno.setFechaNacimiento(fechaNacimiento);
        
        try {
            return alumnoRepository.save(alumno).toDTO();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
        //return alumno.toDTO();
    }
    
}
