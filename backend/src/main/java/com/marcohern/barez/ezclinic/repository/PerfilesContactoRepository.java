package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.PerfilesContacto;
import com.marcohern.barez.ezclinic.entity.PerfilesContactoId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface PerfilesContactoRepository extends Repository<PerfilesContacto, PerfilesContactoId> {
    Optional<PerfilesContacto> findById(PerfilesContactoId id);
    List<PerfilesContacto> findAll();
    Page<PerfilesContacto> findAll(Pageable pageable);
    long count();
    boolean existsById(PerfilesContactoId id);
}
