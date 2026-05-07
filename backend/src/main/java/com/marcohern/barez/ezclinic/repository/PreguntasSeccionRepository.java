package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.PreguntasSeccion;
import com.marcohern.barez.ezclinic.entity.PreguntasSeccionId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface PreguntasSeccionRepository extends Repository<PreguntasSeccion, PreguntasSeccionId> {
    Optional<PreguntasSeccion> findById(PreguntasSeccionId id);
    List<PreguntasSeccion> findAll();
    Page<PreguntasSeccion> findAll(Pageable pageable);
    long count();
    boolean existsById(PreguntasSeccionId id);
}
