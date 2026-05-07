package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Facturacion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface FacturacionRepository extends Repository<Facturacion, Integer> {
    Optional<Facturacion> findById(Integer id);
    List<Facturacion> findAll();
    Page<Facturacion> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
