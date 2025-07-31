package com.guarani.siuguarani.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guarani.siuguarani.models.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
    Alumno findByStudentID(Long studentID);
}
