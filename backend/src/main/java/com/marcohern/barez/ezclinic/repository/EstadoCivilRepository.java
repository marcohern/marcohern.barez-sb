package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.EstadoCivil;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface EstadoCivilRepository extends Repository<EstadoCivil, Integer> {
    Optional<EstadoCivil> findById(Integer id);
    List<EstadoCivil> findAll();
    Page<EstadoCivil> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
