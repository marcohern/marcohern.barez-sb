package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.FotosHClinica;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface FotosHClinicaRepository extends Repository<FotosHClinica, Integer> {
    Optional<FotosHClinica> findById(Integer id);
    List<FotosHClinica> findAll();
    Page<FotosHClinica> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
