package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Formularios;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface FormulariosRepository extends Repository<Formularios, Integer> {
    Optional<Formularios> findById(Integer id);
    List<Formularios> findAll();
    Page<Formularios> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
