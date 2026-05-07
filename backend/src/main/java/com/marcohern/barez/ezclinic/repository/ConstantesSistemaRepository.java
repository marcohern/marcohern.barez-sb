package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.ConstantesSistema;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ConstantesSistemaRepository extends Repository<ConstantesSistema, Integer> {
    Optional<ConstantesSistema> findById(Integer id);
    List<ConstantesSistema> findAll();
    Page<ConstantesSistema> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
