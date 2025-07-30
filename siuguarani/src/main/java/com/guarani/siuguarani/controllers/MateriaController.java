package com.guarani.siuguarani.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MateriaController {

    @GetMapping("/materias")
    public String listarMaterias() {
        return "todo el biribiri de materias";
    }

}
