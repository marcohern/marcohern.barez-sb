package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Sesiones;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface SesionesRepository extends Repository<Sesiones, Integer> {
    Optional<Sesiones> findById(Integer id);
    List<Sesiones> findAll();
    Page<Sesiones> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
