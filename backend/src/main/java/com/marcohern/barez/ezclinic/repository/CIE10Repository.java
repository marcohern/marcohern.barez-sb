package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.CIE10;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface CIE10Repository extends Repository<CIE10, Integer> {
    Optional<CIE10> findById(Integer id);
    List<CIE10> findAll();
    Page<CIE10> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
