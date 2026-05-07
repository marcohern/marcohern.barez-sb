package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.HallazgosConsulta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface HallazgosConsultaRepository extends Repository<HallazgosConsulta, Integer> {
    Optional<HallazgosConsulta> findById(Integer id);
    List<HallazgosConsulta> findAll();
    Page<HallazgosConsulta> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
