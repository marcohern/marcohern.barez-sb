package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Departamento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface DepartamentoRepository extends Repository<Departamento, Integer> {
    Optional<Departamento> findById(Integer id);
    List<Departamento> findAll();
    Page<Departamento> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
