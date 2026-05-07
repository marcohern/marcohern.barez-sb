package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Conceptos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ConceptosRepository extends Repository<Conceptos, Integer> {
    Optional<Conceptos> findById(Integer id);
    List<Conceptos> findAll();
    Page<Conceptos> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
