package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.RequerimientosMedicos;
import com.marcohern.barez.ezclinic.entity.RequerimientosMedicosId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface RequerimientosMedicosRepository extends Repository<RequerimientosMedicos, RequerimientosMedicosId> {
    Optional<RequerimientosMedicos> findById(RequerimientosMedicosId id);
    List<RequerimientosMedicos> findAll();
    Page<RequerimientosMedicos> findAll(Pageable pageable);
    long count();
    boolean existsById(RequerimientosMedicosId id);
}
