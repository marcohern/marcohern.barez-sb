package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.GradoDiscapacidad;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface GradoDiscapacidadRepository extends Repository<GradoDiscapacidad, Integer> {
    Optional<GradoDiscapacidad> findById(Integer id);
    List<GradoDiscapacidad> findAll();
    Page<GradoDiscapacidad> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
