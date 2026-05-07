package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Periodo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface PeriodoRepository extends Repository<Periodo, Integer> {
    Optional<Periodo> findById(Integer id);
    List<Periodo> findAll();
    Page<Periodo> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
