package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.TipoOrden;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface TipoOrdenRepository extends Repository<TipoOrden, Integer> {
    Optional<TipoOrden> findById(Integer id);
    List<TipoOrden> findAll();
    Page<TipoOrden> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
