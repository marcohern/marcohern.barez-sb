package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Cirujanos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface CirujanosRepository extends Repository<Cirujanos, Integer> {
    Optional<Cirujanos> findById(Integer id);
    List<Cirujanos> findAll();
    Page<Cirujanos> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
