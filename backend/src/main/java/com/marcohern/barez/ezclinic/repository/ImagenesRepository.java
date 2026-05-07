package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Imagenes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ImagenesRepository extends Repository<Imagenes, String> {
    Optional<Imagenes> findById(String id);
    List<Imagenes> findAll();
    Page<Imagenes> findAll(Pageable pageable);
    long count();
    boolean existsById(String id);
}
