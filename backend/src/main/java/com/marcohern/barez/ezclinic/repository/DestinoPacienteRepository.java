package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.DestinoPaciente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface DestinoPacienteRepository extends Repository<DestinoPaciente, Integer> {
    Optional<DestinoPaciente> findById(Integer id);
    List<DestinoPaciente> findAll();
    Page<DestinoPaciente> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
