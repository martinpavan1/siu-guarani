package com.guarani.siuguarani.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.guarani.siuguarani.dtos.DTOAlumnoResponse;
import com.guarani.siuguarani.dtos.DTOLogin;
import com.guarani.siuguarani.repositories.AuthRepository;
import com.guarani.siuguarani.models.Alumno;



@Service
public class AuthService {
    @Autowired
    private AuthRepository authRepository;
    
    public ResponseEntity<DTOAlumnoResponse> login(DTOLogin data) {
        
        Optional<Alumno> alumno = authRepository.findByStudentIDAndPassword(data.getStudentID(), data.getPassword());
        if(alumno.isPresent()){
            return ResponseEntity.ok(alumno.get().toDTO());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null); //  gestiona errores
    }
}
