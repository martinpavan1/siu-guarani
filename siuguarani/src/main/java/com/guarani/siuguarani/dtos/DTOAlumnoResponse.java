package com.guarani.siuguarani.dtos;

import java.sql.Date;

import com.guarani.siuguarani.enums.CarreraEnum;
import com.guarani.siuguarani.models.Alumno;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DTOAlumnoResponse {
    
    private Long studentID;
    private String nombre;
    private String apellido;
    private String email;
    private CarreraEnum carrera;
    private Date fechaNacimiento;

    
    public Alumno toEntity(){
        Alumno alumno = new Alumno();
        alumno.setStudentID(this.studentID);
        alumno.setNombre(this.nombre);
        alumno.setApellido(this.apellido);
        alumno.setEmail(this.email);
        alumno.setCarrera(this.carrera);
        alumno.setFechaNacimiento(this.fechaNacimiento);
        return alumno;
    }

}
