package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.ClasificacionRecurso;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ClasificacionRecursoRepository extends Repository<ClasificacionRecurso, Integer> {
    Optional<ClasificacionRecurso> findById(Integer id);
    List<ClasificacionRecurso> findAll();
    Page<ClasificacionRecurso> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
