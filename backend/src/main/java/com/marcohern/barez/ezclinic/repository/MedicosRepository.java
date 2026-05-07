package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Medicos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface MedicosRepository extends Repository<Medicos, Integer> {
    Optional<Medicos> findById(Integer id);
    List<Medicos> findAll();
    Page<Medicos> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
