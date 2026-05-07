package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.RecomendacionesEspecialidades;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface RecomendacionesEspecialidadesRepository extends Repository<RecomendacionesEspecialidades, Integer> {
    Optional<RecomendacionesEspecialidades> findById(Integer id);
    List<RecomendacionesEspecialidades> findAll();
    Page<RecomendacionesEspecialidades> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
