package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.SesionesDemanda;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface SesionesDemandaRepository extends Repository<SesionesDemanda, Integer> {
    Optional<SesionesDemanda> findById(Integer id);
    List<SesionesDemanda> findAll();
    Page<SesionesDemanda> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
