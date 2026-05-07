package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.TrabajadoresSolicitudes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface TrabajadoresSolicitudesRepository extends Repository<TrabajadoresSolicitudes, Integer> {
    Optional<TrabajadoresSolicitudes> findById(Integer id);
    List<TrabajadoresSolicitudes> findAll();
    Page<TrabajadoresSolicitudes> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
