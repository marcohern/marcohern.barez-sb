package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.TipoTarifa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface TipoTarifaRepository extends Repository<TipoTarifa, Integer> {
    Optional<TipoTarifa> findById(Integer id);
    List<TipoTarifa> findAll();
    Page<TipoTarifa> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
