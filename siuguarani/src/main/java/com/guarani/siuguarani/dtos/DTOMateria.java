package com.guarani.siuguarani.dtos;

import com.guarani.siuguarani.enums.EstadoEnum;
import com.guarani.siuguarani.models.InscripcionMateria;
import com.guarani.siuguarani.models.Materia;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DTOMateria {
    private double nota;
    private Materia materia;
    private EstadoEnum estado;

    public InscripcionMateria toEntity() {
        InscripcionMateria inscripcionMateria = new InscripcionMateria();
        inscripcionMateria.setNota(this.nota);
        inscripcionMateria.setMateria(this.materia);
        inscripcionMateria.setEstado(this.estado);
        return inscripcionMateria;
    }
}
