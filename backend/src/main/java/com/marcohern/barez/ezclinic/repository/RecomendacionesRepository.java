package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Recomendaciones;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface RecomendacionesRepository extends Repository<Recomendaciones, Integer> {
    Optional<Recomendaciones> findById(Integer id);
    List<Recomendaciones> findAll();
    Page<Recomendaciones> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
