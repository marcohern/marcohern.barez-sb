package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Secciones;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface SeccionesRepository extends Repository<Secciones, Integer> {
    Optional<Secciones> findById(Integer id);
    List<Secciones> findAll();
    Page<Secciones> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
