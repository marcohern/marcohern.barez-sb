package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.DependenciasIPS;
import com.marcohern.barez.ezclinic.entity.DependenciasIPSId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface DependenciasIPSRepository extends Repository<DependenciasIPS, DependenciasIPSId> {
    Optional<DependenciasIPS> findById(DependenciasIPSId id);
    List<DependenciasIPS> findAll();
    Page<DependenciasIPS> findAll(Pageable pageable);
    long count();
    boolean existsById(DependenciasIPSId id);
}
