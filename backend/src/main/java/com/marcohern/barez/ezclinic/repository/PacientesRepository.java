package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Pacientes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface PacientesRepository extends Repository<Pacientes, Integer> {
    Optional<Pacientes> findById(Integer id);
    List<Pacientes> findAll();
    Page<Pacientes> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
