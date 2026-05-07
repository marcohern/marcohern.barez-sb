package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.TipoPlan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface TipoPlanRepository extends Repository<TipoPlan, Integer> {
    Optional<TipoPlan> findById(Integer id);
    List<TipoPlan> findAll();
    Page<TipoPlan> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
