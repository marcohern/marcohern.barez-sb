package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.MotivoExamen;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface MotivoExamenRepository extends Repository<MotivoExamen, Integer> {
    Optional<MotivoExamen> findById(Integer id);
    List<MotivoExamen> findAll();
    Page<MotivoExamen> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
