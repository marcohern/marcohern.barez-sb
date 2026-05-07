package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.ExamenesEPS;
import com.marcohern.barez.ezclinic.entity.ExamenesEPSId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ExamenesEPSRepository extends Repository<ExamenesEPS, ExamenesEPSId> {
    Optional<ExamenesEPS> findById(ExamenesEPSId id);
    List<ExamenesEPS> findAll();
    Page<ExamenesEPS> findAll(Pageable pageable);
    long count();
    boolean existsById(ExamenesEPSId id);
}
