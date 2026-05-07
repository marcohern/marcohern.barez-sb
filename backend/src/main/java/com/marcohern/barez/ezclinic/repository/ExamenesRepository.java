package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Examenes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ExamenesRepository extends Repository<Examenes, Integer> {
    Optional<Examenes> findById(Integer id);
    List<Examenes> findAll();
    Page<Examenes> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
