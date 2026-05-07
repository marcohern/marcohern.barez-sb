package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.HQuirurgica;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface HQuirurgicaRepository extends Repository<HQuirurgica, Integer> {
    Optional<HQuirurgica> findById(Integer id);
    List<HQuirurgica> findAll();
    Page<HQuirurgica> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
