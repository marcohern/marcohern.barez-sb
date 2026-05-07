package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.ServiciosRecursos;
import com.marcohern.barez.ezclinic.entity.ServiciosRecursosId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ServiciosRecursosRepository extends Repository<ServiciosRecursos, ServiciosRecursosId> {
    Optional<ServiciosRecursos> findById(ServiciosRecursosId id);
    List<ServiciosRecursos> findAll();
    Page<ServiciosRecursos> findAll(Pageable pageable);
    long count();
    boolean existsById(ServiciosRecursosId id);
}
