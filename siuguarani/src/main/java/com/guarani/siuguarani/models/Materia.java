package com.guarani.siuguarani.models;

import com.guarani.siuguarani.enums.CarreraEnum;
import com.guarani.siuguarani.enums.MateriasEnum;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "materias")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Materia {

    @Id
    @Generated("jakarta.persistence.GenerationType.IDENTITY")
    private Long id;

    @Column(name = "codigo", nullable = false, unique = true)
    private String codigo;

    @Column(name = "nombre", nullable = false)
    private MateriasEnum nombre;

    private String descripcion;

    @Enumerated(EnumType.STRING)
    private CarreraEnum carrera;
    
    private int anio;
}
