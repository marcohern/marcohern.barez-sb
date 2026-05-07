package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.ParametrosPreguntas;
import com.marcohern.barez.ezclinic.entity.ParametrosPreguntasId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ParametrosPreguntasRepository extends Repository<ParametrosPreguntas, ParametrosPreguntasId> {
    Optional<ParametrosPreguntas> findById(ParametrosPreguntasId id);
    List<ParametrosPreguntas> findAll();
    Page<ParametrosPreguntas> findAll(Pageable pageable);
    long count();
    boolean existsById(ParametrosPreguntasId id);
}
