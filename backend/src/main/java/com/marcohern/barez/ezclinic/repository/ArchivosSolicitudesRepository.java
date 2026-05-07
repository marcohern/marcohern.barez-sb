package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.ArchivosSolicitudes;
import com.marcohern.barez.ezclinic.entity.ArchivosSolicitudesId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ArchivosSolicitudesRepository extends Repository<ArchivosSolicitudes, ArchivosSolicitudesId> {
    Optional<ArchivosSolicitudes> findById(ArchivosSolicitudesId id);
    List<ArchivosSolicitudes> findAll();
    Page<ArchivosSolicitudes> findAll(Pageable pageable);
    long count();
    boolean existsById(ArchivosSolicitudesId id);
}
