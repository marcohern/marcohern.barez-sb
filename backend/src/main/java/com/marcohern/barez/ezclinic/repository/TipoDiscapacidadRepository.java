package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.TipoDiscapacidad;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface TipoDiscapacidadRepository extends Repository<TipoDiscapacidad, Integer> {
    Optional<TipoDiscapacidad> findById(Integer id);
    List<TipoDiscapacidad> findAll();
    Page<TipoDiscapacidad> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
