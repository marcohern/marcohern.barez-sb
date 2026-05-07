package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.TipoLesion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface TipoLesionRepository extends Repository<TipoLesion, Integer> {
    Optional<TipoLesion> findById(Integer id);
    List<TipoLesion> findAll();
    Page<TipoLesion> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
