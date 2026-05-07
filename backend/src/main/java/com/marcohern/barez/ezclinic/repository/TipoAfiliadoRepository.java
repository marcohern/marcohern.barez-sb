package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.TipoAfiliado;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface TipoAfiliadoRepository extends Repository<TipoAfiliado, Integer> {
    Optional<TipoAfiliado> findById(Integer id);
    List<TipoAfiliado> findAll();
    Page<TipoAfiliado> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
