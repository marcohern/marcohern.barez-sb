package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.AbonosFactura;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface AbonosFacturaRepository extends Repository<AbonosFactura, Integer> {
    Optional<AbonosFactura> findById(Integer id);
    List<AbonosFactura> findAll();
    Page<AbonosFactura> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
