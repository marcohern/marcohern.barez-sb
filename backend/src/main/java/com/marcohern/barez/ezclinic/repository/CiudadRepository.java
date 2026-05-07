package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Ciudad;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface CiudadRepository extends Repository<Ciudad, Integer> {
    Optional<Ciudad> findById(Integer id);
    List<Ciudad> findAll();
    Page<Ciudad> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
