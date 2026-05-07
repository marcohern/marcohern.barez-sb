package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Actividades;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ActividadesRepository extends Repository<Actividades, Integer> {
    Optional<Actividades> findById(Integer id);
    List<Actividades> findAll();
    Page<Actividades> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
