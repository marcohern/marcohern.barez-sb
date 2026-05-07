package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.TipoIdentificacion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface TipoIdentificacionRepository extends Repository<TipoIdentificacion, Integer> {
    Optional<TipoIdentificacion> findById(Integer id);
    List<TipoIdentificacion> findAll();
    Page<TipoIdentificacion> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
