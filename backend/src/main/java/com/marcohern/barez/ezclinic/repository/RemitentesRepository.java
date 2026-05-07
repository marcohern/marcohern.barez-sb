package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Remitentes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface RemitentesRepository extends Repository<Remitentes, Integer> {
    Optional<Remitentes> findById(Integer id);
    List<Remitentes> findAll();
    Page<Remitentes> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
