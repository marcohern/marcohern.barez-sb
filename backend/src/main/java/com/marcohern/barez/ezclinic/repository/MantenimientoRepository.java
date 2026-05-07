package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Mantenimiento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface MantenimientoRepository extends Repository<Mantenimiento, Integer> {
    Optional<Mantenimiento> findById(Integer id);
    List<Mantenimiento> findAll();
    Page<Mantenimiento> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
