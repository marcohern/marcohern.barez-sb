package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.ClasificacionServicios;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ClasificacionServiciosRepository extends Repository<ClasificacionServicios, Integer> {
    Optional<ClasificacionServicios> findById(Integer id);
    List<ClasificacionServicios> findAll();
    Page<ClasificacionServicios> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
