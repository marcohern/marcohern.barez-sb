package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.HistoriasClinicas;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface HistoriasClinicasRepository extends Repository<HistoriasClinicas, Integer> {
    Optional<HistoriasClinicas> findById(Integer id);
    List<HistoriasClinicas> findAll();
    Page<HistoriasClinicas> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
