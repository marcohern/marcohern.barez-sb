package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.FormulariosCita;
import com.marcohern.barez.ezclinic.entity.FormulariosCitaId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface FormulariosCitaRepository extends Repository<FormulariosCita, FormulariosCitaId> {
    Optional<FormulariosCita> findById(FormulariosCitaId id);
    List<FormulariosCita> findAll();
    Page<FormulariosCita> findAll(Pageable pageable);
    long count();
    boolean existsById(FormulariosCitaId id);
}
