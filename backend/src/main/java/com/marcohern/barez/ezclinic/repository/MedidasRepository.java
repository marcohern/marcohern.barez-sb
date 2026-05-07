package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Medidas;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface MedidasRepository extends Repository<Medidas, Integer> {
    Optional<Medidas> findById(Integer id);
    List<Medidas> findAll();
    Page<Medidas> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
