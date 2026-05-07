package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.MotivoConsulta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface MotivoConsultaRepository extends Repository<MotivoConsulta, Integer> {
    Optional<MotivoConsulta> findById(Integer id);
    List<MotivoConsulta> findAll();
    Page<MotivoConsulta> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
