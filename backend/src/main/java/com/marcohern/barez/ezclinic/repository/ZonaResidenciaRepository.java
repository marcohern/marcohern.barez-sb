package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.ZonaResidencia;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ZonaResidenciaRepository extends Repository<ZonaResidencia, Integer> {
    Optional<ZonaResidencia> findById(Integer id);
    List<ZonaResidencia> findAll();
    Page<ZonaResidencia> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
