package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.DetallesDiagnostico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface DetallesDiagnosticoRepository extends Repository<DetallesDiagnostico, Integer> {
    Optional<DetallesDiagnostico> findById(Integer id);
    List<DetallesDiagnostico> findAll();
    Page<DetallesDiagnostico> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
