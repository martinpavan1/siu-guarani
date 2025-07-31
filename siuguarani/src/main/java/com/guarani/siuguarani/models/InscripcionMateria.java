package com.guarani.siuguarani.models;


import com.guarani.siuguarani.dtos.DTOMateria;
import com.guarani.siuguarani.enums.EstadoEnum;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "inscripciones_materias")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InscripcionMateria {
    @Id
    @Generated("jakarta.persistence.GenerationType.AUTO")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "alumno_id", nullable = false)
    private Alumno alumno;

    private double nota;

    @ManyToOne
    @JoinColumn(name = "materia_id", nullable = false)
    private Materia materia;

    @Enumerated(EnumType.STRING)
    private EstadoEnum estado;


    public DTOMateria toDTO() {
        return new DTOMateria(
            this.nota,
            this.materia,
            this.estado
            );
    }

}
