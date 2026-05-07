package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Exposiciones;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ExposicionesRepository extends Repository<Exposiciones, Integer> {
    Optional<Exposiciones> findById(Integer id);
    List<Exposiciones> findAll();
    Page<Exposiciones> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
