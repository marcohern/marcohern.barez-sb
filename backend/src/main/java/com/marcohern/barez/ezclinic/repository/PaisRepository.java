package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Pais;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface PaisRepository extends Repository<Pais, Integer> {
    Optional<Pais> findById(Integer id);
    List<Pais> findAll();
    Page<Pais> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
