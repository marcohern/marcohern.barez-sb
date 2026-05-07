package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.TipoFactura;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface TipoFacturaRepository extends Repository<TipoFactura, Integer> {
    Optional<TipoFactura> findById(Integer id);
    List<TipoFactura> findAll();
    Page<TipoFactura> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
