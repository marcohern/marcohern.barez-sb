package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Preguntas;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface PreguntasRepository extends Repository<Preguntas, Integer> {
    Optional<Preguntas> findById(Integer id);
    List<Preguntas> findAll();
    Page<Preguntas> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
