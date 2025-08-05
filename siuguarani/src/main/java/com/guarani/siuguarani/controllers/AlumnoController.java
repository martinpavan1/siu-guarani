package com.guarani.siuguarani.controllers;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.guarani.siuguarani.dtos.DTOAlumnoResponse;
import com.guarani.siuguarani.services.AlumnoService;

@RestController
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping("/inicio_alumno")
    public DTOAlumnoResponse inicioAlumno(@RequestParam Long studentID) {
        return alumnoService.getAlumnoData(studentID);
        
    }

    @GetMapping("/perfil")
    public DTOAlumnoResponse perfilAlumno(@RequestParam Long studentID) {
        return alumnoService.getAlumnoData(studentID);
    }

    @PostMapping("/actualizar/{studentID}/{nombre}/{apellido}/{email}/{fechaNacimiento}")
    public ResponseEntity<DTOAlumnoResponse> actualizarAlumno(@PathVariable Long studentID, @PathVariable String nombre,
                                                @PathVariable String apellido, @PathVariable String email,
                                                @PathVariable Date fechaNacimiento){

        return ResponseEntity.ok(alumnoService.actualizarAlumnoData(studentID, nombre, apellido, email, fechaNacimiento));
        
    }
    
}
