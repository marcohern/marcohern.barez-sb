package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.PlanSalud;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface PlanSaludRepository extends Repository<PlanSalud, Integer> {
    Optional<PlanSalud> findById(Integer id);
    List<PlanSalud> findAll();
    Page<PlanSalud> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
