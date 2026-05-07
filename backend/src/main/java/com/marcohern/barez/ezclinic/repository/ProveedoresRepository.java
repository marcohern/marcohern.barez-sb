package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Proveedores;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ProveedoresRepository extends Repository<Proveedores, Integer> {
    Optional<Proveedores> findById(Integer id);
    List<Proveedores> findAll();
    Page<Proveedores> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
