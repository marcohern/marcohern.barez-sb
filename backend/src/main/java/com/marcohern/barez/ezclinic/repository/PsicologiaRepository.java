package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Psicologia;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface PsicologiaRepository extends Repository<Psicologia, Integer> {
    Optional<Psicologia> findById(Integer id);
    List<Psicologia> findAll();
    Page<Psicologia> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
