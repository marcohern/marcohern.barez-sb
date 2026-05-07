package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.TipoProcedimiento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface TipoProcedimientoRepository extends Repository<TipoProcedimiento, Integer> {
    Optional<TipoProcedimiento> findById(Integer id);
    List<TipoProcedimiento> findAll();
    Page<TipoProcedimiento> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
