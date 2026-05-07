package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Documentos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface DocumentosRepository extends Repository<Documentos, Long> {
    Optional<Documentos> findById(Long id);
    List<Documentos> findAll();
    Page<Documentos> findAll(Pageable pageable);
    long count();
    boolean existsById(Long id);
}
