package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.TablasRangos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface TablasRangosRepository extends Repository<TablasRangos, Integer> {
    Optional<TablasRangos> findById(Integer id);
    List<TablasRangos> findAll();
    Page<TablasRangos> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
