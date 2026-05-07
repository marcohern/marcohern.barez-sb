package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Evolucion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface EvolucionRepository extends Repository<Evolucion, Integer> {
    Optional<Evolucion> findById(Integer id);
    List<Evolucion> findAll();
    Page<Evolucion> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
