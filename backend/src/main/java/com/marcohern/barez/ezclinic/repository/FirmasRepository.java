package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Firmas;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface FirmasRepository extends Repository<Firmas, String> {
    Optional<Firmas> findById(String id);
    List<Firmas> findAll();
    Page<Firmas> findAll(Pageable pageable);
    long count();
    boolean existsById(String id);
}
