package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.FinalidadConsulta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface FinalidadConsultaRepository extends Repository<FinalidadConsulta, Integer> {
    Optional<FinalidadConsulta> findById(Integer id);
    List<FinalidadConsulta> findAll();
    Page<FinalidadConsulta> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
