package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Informacion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface InformacionRepository extends Repository<Informacion, Integer> {
    Optional<Informacion> findById(Integer id);
    List<Informacion> findAll();
    Page<Informacion> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
