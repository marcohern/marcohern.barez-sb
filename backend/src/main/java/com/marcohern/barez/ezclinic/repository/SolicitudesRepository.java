package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Solicitudes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface SolicitudesRepository extends Repository<Solicitudes, Long> {
    Optional<Solicitudes> findById(Long id);
    List<Solicitudes> findAll();
    Page<Solicitudes> findAll(Pageable pageable);
    long count();
    boolean existsById(Long id);
}
