package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.CausasAccidentes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface CausasAccidentesRepository extends Repository<CausasAccidentes, Integer> {
    Optional<CausasAccidentes> findById(Integer id);
    List<CausasAccidentes> findAll();
    Page<CausasAccidentes> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
