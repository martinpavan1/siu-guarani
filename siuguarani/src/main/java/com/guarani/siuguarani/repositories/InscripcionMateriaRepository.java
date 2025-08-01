package com.guarani.siuguarani.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guarani.siuguarani.models.Alumno;
import com.guarani.siuguarani.models.InscripcionMateria;
import com.guarani.siuguarani.models.Materia;

@Repository
public interface InscripcionMateriaRepository extends JpaRepository<InscripcionMateria, Long> {
    List<InscripcionMateria> findByAlumno(Alumno alumno);
    Optional<InscripcionMateria> findByAlumnoAndMateria(Alumno alumno, Materia materia);

}
