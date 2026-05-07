package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.TipoExposicion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface TipoExposicionRepository extends Repository<TipoExposicion, Integer> {
    Optional<TipoExposicion> findById(Integer id);
    List<TipoExposicion> findAll();
    Page<TipoExposicion> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
