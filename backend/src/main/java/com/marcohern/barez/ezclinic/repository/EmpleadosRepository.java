package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Empleados;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface EmpleadosRepository extends Repository<Empleados, Integer> {
    Optional<Empleados> findById(Integer id);
    List<Empleados> findAll();
    Page<Empleados> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
