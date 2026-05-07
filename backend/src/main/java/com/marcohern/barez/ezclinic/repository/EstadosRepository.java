package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Estados;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface EstadosRepository extends Repository<Estados, Integer> {
    Optional<Estados> findById(Integer id);
    List<Estados> findAll();
    Page<Estados> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
