package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.CondicionVenta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface CondicionVentaRepository extends Repository<CondicionVenta, Integer> {
    Optional<CondicionVenta> findById(Integer id);
    List<CondicionVenta> findAll();
    Page<CondicionVenta> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
