package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.DetallesContactosProveedores;
import com.marcohern.barez.ezclinic.entity.DetallesContactosProveedoresId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface DetallesContactosProveedoresRepository extends Repository<DetallesContactosProveedores, DetallesContactosProveedoresId> {
    Optional<DetallesContactosProveedores> findById(DetallesContactosProveedoresId id);
    List<DetallesContactosProveedores> findAll();
    Page<DetallesContactosProveedores> findAll(Pageable pageable);
    long count();
    boolean existsById(DetallesContactosProveedoresId id);
}
