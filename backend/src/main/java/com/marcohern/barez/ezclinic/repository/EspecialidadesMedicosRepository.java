package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.EspecialidadesMedicos;
import com.marcohern.barez.ezclinic.entity.EspecialidadesMedicosId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface EspecialidadesMedicosRepository extends Repository<EspecialidadesMedicos, EspecialidadesMedicosId> {
    Optional<EspecialidadesMedicos> findById(EspecialidadesMedicosId id);
    List<EspecialidadesMedicos> findAll();
    Page<EspecialidadesMedicos> findAll(Pageable pageable);
    long count();
    boolean existsById(EspecialidadesMedicosId id);
}
