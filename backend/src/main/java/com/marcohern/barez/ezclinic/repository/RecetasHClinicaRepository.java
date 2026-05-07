package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.RecetasHClinica;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface RecetasHClinicaRepository extends Repository<RecetasHClinica, Integer> {
    Optional<RecetasHClinica> findById(Integer id);
    List<RecetasHClinica> findAll();
    Page<RecetasHClinica> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
