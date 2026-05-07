package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.ParametrosCita;
import com.marcohern.barez.ezclinic.entity.ParametrosCitaId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ParametrosCitaRepository extends Repository<ParametrosCita, ParametrosCitaId> {
    Optional<ParametrosCita> findById(ParametrosCitaId id);
    List<ParametrosCita> findAll();
    Page<ParametrosCita> findAll(Pageable pageable);
    long count();
    boolean existsById(ParametrosCitaId id);
}
