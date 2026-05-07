package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Educacion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface EducacionRepository extends Repository<Educacion, Integer> {
    Optional<Educacion> findById(Integer id);
    List<Educacion> findAll();
    Page<Educacion> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
