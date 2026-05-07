package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.AntecedentesEspecificos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface AntecedentesEspecificosRepository extends Repository<AntecedentesEspecificos, Integer> {
    Optional<AntecedentesEspecificos> findById(Integer id);
    List<AntecedentesEspecificos> findAll();
    Page<AntecedentesEspecificos> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
