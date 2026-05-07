package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Entidades;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface EntidadesRepository extends Repository<Entidades, Integer> {
    Optional<Entidades> findById(Integer id);
    List<Entidades> findAll();
    Page<Entidades> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
