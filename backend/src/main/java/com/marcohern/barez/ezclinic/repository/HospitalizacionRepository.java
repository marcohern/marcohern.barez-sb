package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Hospitalizacion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface HospitalizacionRepository extends Repository<Hospitalizacion, Integer> {
    Optional<Hospitalizacion> findById(Integer id);
    List<Hospitalizacion> findAll();
    Page<Hospitalizacion> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
