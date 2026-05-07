package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.TipoPago;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface TipoPagoRepository extends Repository<TipoPago, Integer> {
    Optional<TipoPago> findById(Integer id);
    List<TipoPago> findAll();
    Page<TipoPago> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
