package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Vigencias;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface VigenciasRepository extends Repository<Vigencias, Integer> {
    Optional<Vigencias> findById(Integer id);
    List<Vigencias> findAll();
    Page<Vigencias> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
