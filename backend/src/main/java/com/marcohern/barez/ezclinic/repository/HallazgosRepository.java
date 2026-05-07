package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Hallazgos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface HallazgosRepository extends Repository<Hallazgos, Integer> {
    Optional<Hallazgos> findById(Integer id);
    List<Hallazgos> findAll();
    Page<Hallazgos> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
