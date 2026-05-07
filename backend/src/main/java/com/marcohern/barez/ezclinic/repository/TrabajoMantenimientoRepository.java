package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.TrabajoMantenimiento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface TrabajoMantenimientoRepository extends Repository<TrabajoMantenimiento, Integer> {
    Optional<TrabajoMantenimiento> findById(Integer id);
    List<TrabajoMantenimiento> findAll();
    Page<TrabajoMantenimiento> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
