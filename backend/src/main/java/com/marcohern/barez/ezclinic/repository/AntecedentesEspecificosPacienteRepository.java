package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.AntecedentesEspecificosPaciente;
import com.marcohern.barez.ezclinic.entity.AntecedentesEspecificosPacienteId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface AntecedentesEspecificosPacienteRepository extends Repository<AntecedentesEspecificosPaciente, AntecedentesEspecificosPacienteId> {
    Optional<AntecedentesEspecificosPaciente> findById(AntecedentesEspecificosPacienteId id);
    List<AntecedentesEspecificosPaciente> findAll();
    Page<AntecedentesEspecificosPaciente> findAll(Pageable pageable);
    long count();
    boolean existsById(AntecedentesEspecificosPacienteId id);
}
