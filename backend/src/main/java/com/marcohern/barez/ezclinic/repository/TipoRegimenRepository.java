package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.TipoRegimen;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface TipoRegimenRepository extends Repository<TipoRegimen, Integer> {
    Optional<TipoRegimen> findById(Integer id);
    List<TipoRegimen> findAll();
    Page<TipoRegimen> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
