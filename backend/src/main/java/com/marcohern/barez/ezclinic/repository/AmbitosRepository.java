package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Ambitos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface AmbitosRepository extends Repository<Ambitos, Integer> {
    Optional<Ambitos> findById(Integer id);
    List<Ambitos> findAll();
    Page<Ambitos> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
