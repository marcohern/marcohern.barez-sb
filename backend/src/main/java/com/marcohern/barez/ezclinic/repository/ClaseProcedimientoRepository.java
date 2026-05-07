package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.ClaseProcedimiento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ClaseProcedimientoRepository extends Repository<ClaseProcedimiento, Integer> {
    Optional<ClaseProcedimiento> findById(Integer id);
    List<ClaseProcedimiento> findAll();
    Page<ClaseProcedimiento> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
