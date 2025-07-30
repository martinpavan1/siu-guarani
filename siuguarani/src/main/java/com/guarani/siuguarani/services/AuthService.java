package com.guarani.siuguarani.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guarani.siuguarani.dtos.DTOAlumnoResponse;
import com.guarani.siuguarani.dtos.DTOLogin;
import com.guarani.siuguarani.repositories.AuthRepository;
import com.guarani.siuguarani.models.Alumno;



@Service
public class AuthService {
    @Autowired
    private AuthRepository authRepository;
    
    public DTOAlumnoResponse login(DTOLogin data) {
        
        Alumno alumno = authRepository.findByStudentIDAndPassword(data.getStudentID(), data.getPassword());
        return alumno.toDTO();
    }
}
