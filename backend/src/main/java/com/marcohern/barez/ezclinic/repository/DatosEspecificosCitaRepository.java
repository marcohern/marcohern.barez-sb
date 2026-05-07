package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.DatosEspecificosCita;
import com.marcohern.barez.ezclinic.entity.DatosEspecificosCitaId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface DatosEspecificosCitaRepository extends Repository<DatosEspecificosCita, DatosEspecificosCitaId> {
    Optional<DatosEspecificosCita> findById(DatosEspecificosCitaId id);
    List<DatosEspecificosCita> findAll();
    Page<DatosEspecificosCita> findAll(Pageable pageable);
    long count();
    boolean existsById(DatosEspecificosCitaId id);
}
