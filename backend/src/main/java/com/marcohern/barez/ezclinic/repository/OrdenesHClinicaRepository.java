package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.OrdenesHClinica;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface OrdenesHClinicaRepository extends Repository<OrdenesHClinica, Integer> {
    Optional<OrdenesHClinica> findById(Integer id);
    List<OrdenesHClinica> findAll();
    Page<OrdenesHClinica> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
