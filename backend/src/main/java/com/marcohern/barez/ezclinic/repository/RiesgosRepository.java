package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Riesgos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface RiesgosRepository extends Repository<Riesgos, Integer> {
    Optional<Riesgos> findById(Integer id);
    List<Riesgos> findAll();
    Page<Riesgos> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
