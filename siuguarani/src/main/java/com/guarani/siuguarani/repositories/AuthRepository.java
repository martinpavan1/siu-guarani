package com.guarani.siuguarani.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guarani.siuguarani.models.Alumno;

@Repository
public interface AuthRepository extends JpaRepository<Alumno, Long> {
    Alumno findByStudentIDAndPassword(Long studentID, String password);
}
