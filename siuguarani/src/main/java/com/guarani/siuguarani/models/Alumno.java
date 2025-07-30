package com.guarani.siuguarani.models;

import java.sql.Date;

import com.guarani.siuguarani.enums.CarreraEnum;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "alumnos")
@AllArgsConstructor
@Data
public class Alumno {
    @Id
    @Generated("jakarta.persistence.GenerationType.IDENTITY")
    private Long id;

    @Column(name = "student_id", nullable = false, unique = true)
    private Long studentID;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(nullable = false, unique = true)
    private String email;
    
    @Enumerated(EnumType.STRING)
    private CarreraEnum carrera;
    
    private Date fechaNacimiento;

    
}
