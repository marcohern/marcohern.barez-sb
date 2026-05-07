package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.PerfilesEmpleado;
import com.marcohern.barez.ezclinic.entity.PerfilesEmpleadoId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface PerfilesEmpleadoRepository extends Repository<PerfilesEmpleado, PerfilesEmpleadoId> {
    Optional<PerfilesEmpleado> findById(PerfilesEmpleadoId id);
    List<PerfilesEmpleado> findAll();
    Page<PerfilesEmpleado> findAll(Pageable pageable);
    long count();
    boolean existsById(PerfilesEmpleadoId id);
}
