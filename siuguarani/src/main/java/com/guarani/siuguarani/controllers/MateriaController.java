package com.guarani.siuguarani.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.guarani.siuguarani.dtos.DTOInscripcionMateria;
import com.guarani.siuguarani.services.MateriaService;

@RestController
public class MateriaController {
    @Autowired
    private MateriaService materiaService;
    

    
    @GetMapping("/mis_materias")
        public List<DTOInscripcionMateria> listarMateriasPorAlumno(@RequestParam Long studentID) {
            return materiaService.listarMateriasPorAlumno(studentID);
    }

    @PostMapping("/inscripcion/{studentID}/{materiaID}")
    public DTOInscripcionMateria inscribirMateria(@PathVariable Long studentID, @PathVariable Long materiaID) {
        return materiaService.inscribirMateria(studentID, materiaID);
    }
    

}
