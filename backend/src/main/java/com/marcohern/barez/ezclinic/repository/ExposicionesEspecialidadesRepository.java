package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.ExposicionesEspecialidades;
import com.marcohern.barez.ezclinic.entity.ExposicionesEspecialidadesId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ExposicionesEspecialidadesRepository extends Repository<ExposicionesEspecialidades, ExposicionesEspecialidadesId> {
    Optional<ExposicionesEspecialidades> findById(ExposicionesEspecialidadesId id);
    List<ExposicionesEspecialidades> findAll();
    Page<ExposicionesEspecialidades> findAll(Pageable pageable);
    long count();
    boolean existsById(ExposicionesEspecialidadesId id);
}
