package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.RequerimientosServicios;
import com.marcohern.barez.ezclinic.entity.RequerimientosServiciosId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface RequerimientosServiciosRepository extends Repository<RequerimientosServicios, RequerimientosServiciosId> {
    Optional<RequerimientosServicios> findById(RequerimientosServiciosId id);
    List<RequerimientosServicios> findAll();
    Page<RequerimientosServicios> findAll(Pageable pageable);
    long count();
    boolean existsById(RequerimientosServiciosId id);
}
