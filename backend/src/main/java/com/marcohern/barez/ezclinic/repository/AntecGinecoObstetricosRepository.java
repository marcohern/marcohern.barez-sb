package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.AntecGinecoObstetricos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface AntecGinecoObstetricosRepository extends Repository<AntecGinecoObstetricos, Integer> {
    Optional<AntecGinecoObstetricos> findById(Integer id);
    List<AntecGinecoObstetricos> findAll();
    Page<AntecGinecoObstetricos> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
