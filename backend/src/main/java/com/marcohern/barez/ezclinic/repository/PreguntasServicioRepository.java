package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.PreguntasServicio;
import com.marcohern.barez.ezclinic.entity.PreguntasServicioId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface PreguntasServicioRepository extends Repository<PreguntasServicio, PreguntasServicioId> {
    Optional<PreguntasServicio> findById(PreguntasServicioId id);
    List<PreguntasServicio> findAll();
    Page<PreguntasServicio> findAll(Pageable pageable);
    long count();
    boolean existsById(PreguntasServicioId id);
}
