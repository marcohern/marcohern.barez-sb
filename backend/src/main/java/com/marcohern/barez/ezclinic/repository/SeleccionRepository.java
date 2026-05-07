package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Seleccion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface SeleccionRepository extends Repository<Seleccion, Integer> {
    Optional<Seleccion> findById(Integer id);
    List<Seleccion> findAll();
    Page<Seleccion> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
