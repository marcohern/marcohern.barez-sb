package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.RevisionSistemas;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface RevisionSistemasRepository extends Repository<RevisionSistemas, Integer> {
    Optional<RevisionSistemas> findById(Integer id);
    List<RevisionSistemas> findAll();
    Page<RevisionSistemas> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
