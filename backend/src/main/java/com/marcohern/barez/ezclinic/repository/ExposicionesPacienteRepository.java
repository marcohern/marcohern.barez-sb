package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.ExposicionesPaciente;
import com.marcohern.barez.ezclinic.entity.ExposicionesPacienteId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ExposicionesPacienteRepository extends Repository<ExposicionesPaciente, ExposicionesPacienteId> {
    Optional<ExposicionesPaciente> findById(ExposicionesPacienteId id);
    List<ExposicionesPaciente> findAll();
    Page<ExposicionesPaciente> findAll(Pageable pageable);
    long count();
    boolean existsById(ExposicionesPacienteId id);
}
