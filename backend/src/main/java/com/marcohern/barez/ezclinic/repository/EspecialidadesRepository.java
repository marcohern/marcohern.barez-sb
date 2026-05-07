package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Especialidades;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface EspecialidadesRepository extends Repository<Especialidades, Integer> {
    Optional<Especialidades> findById(Integer id);
    List<Especialidades> findAll();
    Page<Especialidades> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
