package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.EnfermedadesEmpresa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface EnfermedadesEmpresaRepository extends Repository<EnfermedadesEmpresa, Integer> {
    Optional<EnfermedadesEmpresa> findById(Integer id);
    List<EnfermedadesEmpresa> findAll();
    Page<EnfermedadesEmpresa> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
