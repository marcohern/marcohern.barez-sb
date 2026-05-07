package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Lotes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface LotesRepository extends Repository<Lotes, Integer> {
    Optional<Lotes> findById(Integer id);
    List<Lotes> findAll();
    Page<Lotes> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
