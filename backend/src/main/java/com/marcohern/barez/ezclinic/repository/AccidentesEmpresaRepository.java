package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.AccidentesEmpresa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface AccidentesEmpresaRepository extends Repository<AccidentesEmpresa, Integer> {
    Optional<AccidentesEmpresa> findById(Integer id);
    List<AccidentesEmpresa> findAll();
    Page<AccidentesEmpresa> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
