package com.guarani.siuguarani.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guarani.siuguarani.models.Correlativa;
import com.guarani.siuguarani.models.Materia;

@Repository
public interface CorrelativaRepository extends JpaRepository<Correlativa, Long>{
    List<Correlativa> findByMateria(Materia materia);
}
