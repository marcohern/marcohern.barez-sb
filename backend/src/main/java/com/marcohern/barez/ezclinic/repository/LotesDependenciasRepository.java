package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.LotesDependencias;
import com.marcohern.barez.ezclinic.entity.LotesDependenciasId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface LotesDependenciasRepository extends Repository<LotesDependencias, LotesDependenciasId> {
    Optional<LotesDependencias> findById(LotesDependenciasId id);
    List<LotesDependencias> findAll();
    Page<LotesDependencias> findAll(Pageable pageable);
    long count();
    boolean existsById(LotesDependenciasId id);
}
