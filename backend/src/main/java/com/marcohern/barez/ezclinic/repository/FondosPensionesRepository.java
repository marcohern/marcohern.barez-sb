package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.FondosPensiones;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface FondosPensionesRepository extends Repository<FondosPensiones, Integer> {
    Optional<FondosPensiones> findById(Integer id);
    List<FondosPensiones> findAll();
    Page<FondosPensiones> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
