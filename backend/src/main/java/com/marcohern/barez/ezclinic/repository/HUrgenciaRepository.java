package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.HUrgencia;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface HUrgenciaRepository extends Repository<HUrgencia, Integer> {
    Optional<HUrgencia> findById(Integer id);
    List<HUrgencia> findAll();
    Page<HUrgencia> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
