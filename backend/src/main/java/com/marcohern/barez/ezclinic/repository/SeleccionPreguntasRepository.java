package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.SeleccionPreguntas;
import com.marcohern.barez.ezclinic.entity.SeleccionPreguntasId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface SeleccionPreguntasRepository extends Repository<SeleccionPreguntas, SeleccionPreguntasId> {
    Optional<SeleccionPreguntas> findById(SeleccionPreguntasId id);
    List<SeleccionPreguntas> findAll();
    Page<SeleccionPreguntas> findAll(Pageable pageable);
    long count();
    boolean existsById(SeleccionPreguntasId id);
}
