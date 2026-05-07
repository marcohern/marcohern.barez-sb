package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Restricciones;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface RestriccionesRepository extends Repository<Restricciones, Integer> {
    Optional<Restricciones> findById(Integer id);
    List<Restricciones> findAll();
    Page<Restricciones> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
