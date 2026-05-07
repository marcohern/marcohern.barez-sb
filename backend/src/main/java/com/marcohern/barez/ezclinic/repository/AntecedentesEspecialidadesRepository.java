package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.AntecedentesEspecialidades;
import com.marcohern.barez.ezclinic.entity.AntecedentesEspecialidadesId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface AntecedentesEspecialidadesRepository extends Repository<AntecedentesEspecialidades, AntecedentesEspecialidadesId> {
    Optional<AntecedentesEspecialidades> findById(AntecedentesEspecialidadesId id);
    List<AntecedentesEspecialidades> findAll();
    Page<AntecedentesEspecialidades> findAll(Pageable pageable);
    long count();
    boolean existsById(AntecedentesEspecialidadesId id);
}
