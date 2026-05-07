package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.DestinoRecursos;
import com.marcohern.barez.ezclinic.entity.DestinoRecursosId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface DestinoRecursosRepository extends Repository<DestinoRecursos, DestinoRecursosId> {
    Optional<DestinoRecursos> findById(DestinoRecursosId id);
    List<DestinoRecursos> findAll();
    Page<DestinoRecursos> findAll(Pageable pageable);
    long count();
    boolean existsById(DestinoRecursosId id);
}
