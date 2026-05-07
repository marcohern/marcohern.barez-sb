package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Antecedentes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface AntecedentesRepository extends Repository<Antecedentes, Integer> {
    Optional<Antecedentes> findById(Integer id);
    List<Antecedentes> findAll();
    Page<Antecedentes> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
