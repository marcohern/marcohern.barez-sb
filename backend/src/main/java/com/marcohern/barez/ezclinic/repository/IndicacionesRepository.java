package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Indicaciones;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface IndicacionesRepository extends Repository<Indicaciones, Integer> {
    Optional<Indicaciones> findById(Integer id);
    List<Indicaciones> findAll();
    Page<Indicaciones> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
