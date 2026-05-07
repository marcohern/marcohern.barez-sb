package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Resultados;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ResultadosRepository extends Repository<Resultados, Integer> {
    Optional<Resultados> findById(Integer id);
    List<Resultados> findAll();
    Page<Resultados> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
