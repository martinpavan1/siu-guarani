package com.guarani.siuguarani.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.guarani.siuguarani.models.Alumno;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DTOLogin {
    private Long studentID;
    private String password;

    public Alumno toEntity() {
        Alumno alumno = new Alumno();
        alumno.setStudentID(this.studentID);
        alumno.setPassword(this.password);
        return alumno;
    }
}
