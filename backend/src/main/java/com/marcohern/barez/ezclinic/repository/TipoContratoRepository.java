package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.TipoContrato;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface TipoContratoRepository extends Repository<TipoContrato, Integer> {
    Optional<TipoContrato> findById(Integer id);
    List<TipoContrato> findAll();
    Page<TipoContrato> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
