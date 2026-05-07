package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.ContratosMedicos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ContratosMedicosRepository extends Repository<ContratosMedicos, Integer> {
    Optional<ContratosMedicos> findById(Integer id);
    List<ContratosMedicos> findAll();
    Page<ContratosMedicos> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
