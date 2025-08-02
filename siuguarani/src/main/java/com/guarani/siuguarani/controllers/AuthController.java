package com.guarani.siuguarani.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.guarani.siuguarani.dtos.DTOAlumnoResponse;
import com.guarani.siuguarani.dtos.DTOLogin;
import com.guarani.siuguarani.services.AuthService;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;
    
    @PostMapping("/acceso")
    public ResponseEntity<DTOAlumnoResponse> login(@RequestBody DTOLogin data) {
       return authService.login(data);
    }

}