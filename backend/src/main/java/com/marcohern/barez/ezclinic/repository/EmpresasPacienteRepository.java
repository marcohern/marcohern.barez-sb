package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.EmpresasPaciente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface EmpresasPacienteRepository extends Repository<EmpresasPaciente, Integer> {
    Optional<EmpresasPaciente> findById(Integer id);
    List<EmpresasPaciente> findAll();
    Page<EmpresasPaciente> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
