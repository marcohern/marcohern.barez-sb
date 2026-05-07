package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Recursos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface RecursosRepository extends Repository<Recursos, Integer> {
    Optional<Recursos> findById(Integer id);
    List<Recursos> findAll();
    Page<Recursos> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
