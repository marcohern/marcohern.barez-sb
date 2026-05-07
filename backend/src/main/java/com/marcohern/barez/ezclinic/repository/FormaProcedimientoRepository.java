package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.FormaProcedimiento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface FormaProcedimientoRepository extends Repository<FormaProcedimiento, Integer> {
    Optional<FormaProcedimiento> findById(Integer id);
    List<FormaProcedimiento> findAll();
    Page<FormaProcedimiento> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
