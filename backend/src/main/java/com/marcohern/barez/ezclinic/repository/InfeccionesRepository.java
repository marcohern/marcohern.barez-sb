package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Infecciones;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface InfeccionesRepository extends Repository<Infecciones, Integer> {
    Optional<Infecciones> findById(Integer id);
    List<Infecciones> findAll();
    Page<Infecciones> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
