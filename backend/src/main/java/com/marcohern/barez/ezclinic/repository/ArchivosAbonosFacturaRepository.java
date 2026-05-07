package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.ArchivosAbonosFactura;
import com.marcohern.barez.ezclinic.entity.ArchivosAbonosFacturaId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ArchivosAbonosFacturaRepository extends Repository<ArchivosAbonosFactura, ArchivosAbonosFacturaId> {
    Optional<ArchivosAbonosFactura> findById(ArchivosAbonosFacturaId id);
    List<ArchivosAbonosFactura> findAll();
    Page<ArchivosAbonosFactura> findAll(Pageable pageable);
    long count();
    boolean existsById(ArchivosAbonosFacturaId id);
}
