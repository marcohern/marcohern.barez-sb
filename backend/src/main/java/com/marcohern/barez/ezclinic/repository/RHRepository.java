package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.RH;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface RHRepository extends Repository<RH, String> {
    Optional<RH> findById(String id);
    List<RH> findAll();
    Page<RH> findAll(Pageable pageable);
    long count();
    boolean existsById(String id);
}
