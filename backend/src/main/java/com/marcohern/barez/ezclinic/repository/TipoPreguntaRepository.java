package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.TipoPregunta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface TipoPreguntaRepository extends Repository<TipoPregunta, Integer> {
    Optional<TipoPregunta> findById(Integer id);
    List<TipoPregunta> findAll();
    Page<TipoPregunta> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
