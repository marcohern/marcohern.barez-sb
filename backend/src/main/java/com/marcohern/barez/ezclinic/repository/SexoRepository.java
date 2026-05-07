package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Sexo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface SexoRepository extends Repository<Sexo, Integer> {
    Optional<Sexo> findById(Integer id);
    List<Sexo> findAll();
    Page<Sexo> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
