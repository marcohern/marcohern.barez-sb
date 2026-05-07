package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.TipoConsulta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface TipoConsultaRepository extends Repository<TipoConsulta, Integer> {
    Optional<TipoConsulta> findById(Integer id);
    List<TipoConsulta> findAll();
    Page<TipoConsulta> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
