package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Parametros;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ParametrosRepository extends Repository<Parametros, Integer> {
    Optional<Parametros> findById(Integer id);
    List<Parametros> findAll();
    Page<Parametros> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
