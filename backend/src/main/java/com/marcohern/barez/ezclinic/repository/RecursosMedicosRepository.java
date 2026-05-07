package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.RecursosMedicos;
import com.marcohern.barez.ezclinic.entity.RecursosMedicosId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface RecursosMedicosRepository extends Repository<RecursosMedicos, RecursosMedicosId> {
    Optional<RecursosMedicos> findById(RecursosMedicosId id);
    List<RecursosMedicos> findAll();
    Page<RecursosMedicos> findAll(Pageable pageable);
    long count();
    boolean existsById(RecursosMedicosId id);
}
