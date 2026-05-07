package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Perfiles;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface PerfilesRepository extends Repository<Perfiles, Integer> {
    Optional<Perfiles> findById(Integer id);
    List<Perfiles> findAll();
    Page<Perfiles> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
