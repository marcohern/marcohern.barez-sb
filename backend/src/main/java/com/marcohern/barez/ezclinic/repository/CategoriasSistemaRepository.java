package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.CategoriasSistema;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface CategoriasSistemaRepository extends Repository<CategoriasSistema, Integer> {
    Optional<CategoriasSistema> findById(Integer id);
    List<CategoriasSistema> findAll();
    Page<CategoriasSistema> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
