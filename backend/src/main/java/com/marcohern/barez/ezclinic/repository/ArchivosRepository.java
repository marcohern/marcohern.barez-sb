package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Archivos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ArchivosRepository extends Repository<Archivos, Long> {
    Optional<Archivos> findById(Long id);
    List<Archivos> findAll();
    Page<Archivos> findAll(Pageable pageable);
    long count();
    boolean existsById(Long id);
}
