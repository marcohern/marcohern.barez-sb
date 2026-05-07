package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.EPS;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface EPSRepository extends Repository<EPS, Integer> {
    Optional<EPS> findById(Integer id);
    List<EPS> findAll();
    Page<EPS> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
