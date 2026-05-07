package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.CausaExterna;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface CausaExternaRepository extends Repository<CausaExterna, Integer> {
    Optional<CausaExterna> findById(Integer id);
    List<CausaExterna> findAll();
    Page<CausaExterna> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
