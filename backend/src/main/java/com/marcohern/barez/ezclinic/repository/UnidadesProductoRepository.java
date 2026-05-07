package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.UnidadesProducto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface UnidadesProductoRepository extends Repository<UnidadesProducto, Integer> {
    Optional<UnidadesProducto> findById(Integer id);
    List<UnidadesProducto> findAll();
    Page<UnidadesProducto> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
