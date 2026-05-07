package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.RecomendacionesCIE10;
import com.marcohern.barez.ezclinic.entity.RecomendacionesCIE10Id;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface RecomendacionesCIE10Repository extends Repository<RecomendacionesCIE10, RecomendacionesCIE10Id> {
    Optional<RecomendacionesCIE10> findById(RecomendacionesCIE10Id id);
    List<RecomendacionesCIE10> findAll();
    Page<RecomendacionesCIE10> findAll(Pageable pageable);
    long count();
    boolean existsById(RecomendacionesCIE10Id id);
}
