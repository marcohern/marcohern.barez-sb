package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.HConsulta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface HConsultaRepository extends Repository<HConsulta, Integer> {
    Optional<HConsulta> findById(Integer id);
    List<HConsulta> findAll();
    Page<HConsulta> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
