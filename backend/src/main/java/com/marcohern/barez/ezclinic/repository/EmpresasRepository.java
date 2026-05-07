package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Empresas;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface EmpresasRepository extends Repository<Empresas, Integer> {
    Optional<Empresas> findById(Integer id);
    List<Empresas> findAll();
    Page<Empresas> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
