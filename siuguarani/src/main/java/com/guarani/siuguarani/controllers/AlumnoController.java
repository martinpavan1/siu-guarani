package com.guarani.siuguarani.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlumnoController {

    @GetMapping("/inicio_alumno")
    public String inicioAlumno() {
        return "Anda el endpoint de inicio alumno";
    }

    @GetMapping("/perfil")
    public String perfil() {
        return "Anda el endpoint de perfil";
    }

    @GetMapping("/informes")
    public String informes() {
        return "Anda el endpoint de informes";
    }

    @GetMapping("/informes/alumno_regular")
    public String alumnoRegular() {
        return "Anda el endpoint de informes alumno regular";
    }

    @GetMapping("/informes/avance_carrera")
    public String avanceCarrera() {
        return "Anda el endpoint de informes avance carrera";
    }
    
}
