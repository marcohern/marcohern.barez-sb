package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Dependencias;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface DependenciasRepository extends Repository<Dependencias, Integer> {
    Optional<Dependencias> findById(Integer id);
    List<Dependencias> findAll();
    Page<Dependencias> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
