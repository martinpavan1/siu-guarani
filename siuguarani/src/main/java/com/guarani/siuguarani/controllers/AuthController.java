package com.guarani.siuguarani.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.guarani.siuguarani.dtos.DTOAlumnoResponse;
import com.guarani.siuguarani.dtos.DTOLogin;
import com.guarani.siuguarani.services.AuthService;
import com.guarani.siuguarani.utils.JWTUtil;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;
    @Autowired
    private JWTUtil jwtGenerator;
    
    @PostMapping("/acceso")
    public ResponseEntity<DTOAlumnoResponse> login(@RequestBody DTOLogin data) {
        ResponseEntity<DTOAlumnoResponse> response= authService.login(data); 
        
        String token = jwtGenerator.generateToken(response.getBody().getNombre());
        response.getBody().setToken(token);
        
        return response;

    }

}