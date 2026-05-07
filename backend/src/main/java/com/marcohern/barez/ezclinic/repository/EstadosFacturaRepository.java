package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.EstadosFactura;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface EstadosFacturaRepository extends Repository<EstadosFactura, Integer> {
    Optional<EstadosFactura> findById(Integer id);
    List<EstadosFactura> findAll();
    Page<EstadosFactura> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
