package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Unidades;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface UnidadesRepository extends Repository<Unidades, Integer> {
    Optional<Unidades> findById(Integer id);
    List<Unidades> findAll();
    Page<Unidades> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
