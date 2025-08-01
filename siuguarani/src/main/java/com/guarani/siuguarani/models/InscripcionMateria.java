package com.guarani.siuguarani.models;


import com.guarani.siuguarani.dtos.DTOInscripcionMateria;
import com.guarani.siuguarani.enums.EstadoEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "alumno_id", nullable = false)
    private Alumno alumno;

    private Integer nota;

    @ManyToOne
    @JoinColumn(name = "materia_id", nullable = false)
    private Materia materia;

    @Enumerated(EnumType.STRING)
    private EstadoEnum estado;


    public DTOInscripcionMateria toDTO() {
        return new DTOInscripcionMateria(
            this.nota,
            this.materia,
            this.estado
            );
    }

}
