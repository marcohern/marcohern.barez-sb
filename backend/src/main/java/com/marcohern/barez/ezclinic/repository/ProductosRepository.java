package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Productos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ProductosRepository extends Repository<Productos, Integer> {
    Optional<Productos> findById(Integer id);
    List<Productos> findAll();
    Page<Productos> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
