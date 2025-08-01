package com.guarani.siuguarani.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guarani.siuguarani.models.Materia;

@Repository
public interface MateriaRepository  extends JpaRepository<Materia, Long> {
}
