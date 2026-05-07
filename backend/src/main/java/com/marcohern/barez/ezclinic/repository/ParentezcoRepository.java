package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Parentezco;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ParentezcoRepository extends Repository<Parentezco, Integer> {
    Optional<Parentezco> findById(Integer id);
    List<Parentezco> findAll();
    Page<Parentezco> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
