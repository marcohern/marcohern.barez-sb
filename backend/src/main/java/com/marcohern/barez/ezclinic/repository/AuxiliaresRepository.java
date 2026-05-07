package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Auxiliares;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface AuxiliaresRepository extends Repository<Auxiliares, Integer> {
    Optional<Auxiliares> findById(Integer id);
    List<Auxiliares> findAll();
    Page<Auxiliares> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
