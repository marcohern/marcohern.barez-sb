package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.IPSTarifasAux;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface IPSTarifasAuxRepository extends Repository<IPSTarifasAux, Integer> {
    Optional<IPSTarifasAux> findById(Integer id);
    List<IPSTarifasAux> findAll();
    Page<IPSTarifasAux> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
