package com.guarani.siuguarani.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/informes")
    public String informes() {
        return "Anda el endpoint de informes";
    }

    @GetMapping("/informes/alumno_regular")
    public String alumnoRegular(@RequestParam Long studentID) {
        return alumnoService.alumnoRegular(studentID);
    }

    @GetMapping("/informes/avance_carrera")
    public String avanceCarrera(@RequestParam Long studentID) {
        return "Anda el endpoint de informes avance carrera";
    }
    
}
