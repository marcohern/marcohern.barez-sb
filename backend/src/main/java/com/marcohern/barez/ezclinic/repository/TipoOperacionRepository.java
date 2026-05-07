package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.TipoOperacion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface TipoOperacionRepository extends Repository<TipoOperacion, Short> {
    Optional<TipoOperacion> findById(Short id);
    List<TipoOperacion> findAll();
    Page<TipoOperacion> findAll(Pageable pageable);
    long count();
    boolean existsById(Short id);
}
