package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.EpsDisponibles;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface EpsDisponiblesRepository extends Repository<EpsDisponibles, Integer> {
    Optional<EpsDisponibles> findById(Integer id);
    List<EpsDisponibles> findAll();
    Page<EpsDisponibles> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
