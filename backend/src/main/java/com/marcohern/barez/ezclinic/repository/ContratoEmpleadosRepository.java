package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.ContratoEmpleados;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ContratoEmpleadosRepository extends Repository<ContratoEmpleados, Integer> {
    Optional<ContratoEmpleados> findById(Integer id);
    List<ContratoEmpleados> findAll();
    Page<ContratoEmpleados> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
