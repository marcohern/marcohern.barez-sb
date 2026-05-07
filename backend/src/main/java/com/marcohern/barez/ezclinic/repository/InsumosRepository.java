package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Insumos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface InsumosRepository extends Repository<Insumos, Integer> {
    Optional<Insumos> findById(Integer id);
    List<Insumos> findAll();
    Page<Insumos> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
