package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Ocupaciones;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface OcupacionesRepository extends Repository<Ocupaciones, Integer> {
    Optional<Ocupaciones> findById(Integer id);
    List<Ocupaciones> findAll();
    Page<Ocupaciones> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
