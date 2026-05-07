package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.RecomendacionesHistoria;
import com.marcohern.barez.ezclinic.entity.RecomendacionesHistoriaId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface RecomendacionesHistoriaRepository extends Repository<RecomendacionesHistoria, RecomendacionesHistoriaId> {
    Optional<RecomendacionesHistoria> findById(RecomendacionesHistoriaId id);
    List<RecomendacionesHistoria> findAll();
    Page<RecomendacionesHistoria> findAll(Pageable pageable);
    long count();
    boolean existsById(RecomendacionesHistoriaId id);
}
