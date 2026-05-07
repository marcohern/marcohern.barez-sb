package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.ControlesPlanSalud;
import com.marcohern.barez.ezclinic.entity.ControlesPlanSaludId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ControlesPlanSaludRepository extends Repository<ControlesPlanSalud, ControlesPlanSaludId> {
    Optional<ControlesPlanSalud> findById(ControlesPlanSaludId id);
    List<ControlesPlanSalud> findAll();
    Page<ControlesPlanSalud> findAll(Pageable pageable);
    long count();
    boolean existsById(ControlesPlanSaludId id);
}
