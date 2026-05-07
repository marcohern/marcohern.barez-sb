package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Cobertura;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface CoberturaRepository extends Repository<Cobertura, Short> {
    Optional<Cobertura> findById(Short id);
    List<Cobertura> findAll();
    Page<Cobertura> findAll(Pageable pageable);
    long count();
    boolean existsById(Short id);
}
