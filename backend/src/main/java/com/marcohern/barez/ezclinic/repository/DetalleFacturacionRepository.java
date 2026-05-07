package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.DetalleFacturacion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface DetalleFacturacionRepository extends Repository<DetalleFacturacion, Long> {
    Optional<DetalleFacturacion> findById(Long id);
    List<DetalleFacturacion> findAll();
    Page<DetalleFacturacion> findAll(Pageable pageable);
    long count();
    boolean existsById(Long id);
}
