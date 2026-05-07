package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.DisponibilidadRecursos;
import com.marcohern.barez.ezclinic.entity.DisponibilidadRecursosId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface DisponibilidadRecursosRepository extends Repository<DisponibilidadRecursos, DisponibilidadRecursosId> {
    Optional<DisponibilidadRecursos> findById(DisponibilidadRecursosId id);
    List<DisponibilidadRecursos> findAll();
    Page<DisponibilidadRecursos> findAll(Pageable pageable);
    long count();
    boolean existsById(DisponibilidadRecursosId id);
}
