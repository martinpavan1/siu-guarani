package com.guarani.siuguarani.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class holaController {

    @GetMapping("/hola")
    public String hola() {
        return "Hola desde el controlador";
    }
    @GetMapping("/adios")
    public String adios() {
        return "Adiós desde el controlador";
    }   
    
}
