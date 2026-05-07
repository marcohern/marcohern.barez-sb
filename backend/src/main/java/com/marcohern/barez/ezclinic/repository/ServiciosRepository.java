package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Servicios;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ServiciosRepository extends Repository<Servicios, Integer> {
    Optional<Servicios> findById(Integer id);
    List<Servicios> findAll();
    Page<Servicios> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
