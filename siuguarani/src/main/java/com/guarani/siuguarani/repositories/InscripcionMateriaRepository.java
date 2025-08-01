package com.guarani.siuguarani.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guarani.siuguarani.models.Alumno;
import com.guarani.siuguarani.models.InscripcionMateria;

@Repository
public interface InscripcionMateriaRepository extends JpaRepository<InscripcionMateria, Long> {
    List<InscripcionMateria> findByAlumno(Alumno alumno);
    //InscripcionMateria findByMateriaId(Long materiaID);

}
