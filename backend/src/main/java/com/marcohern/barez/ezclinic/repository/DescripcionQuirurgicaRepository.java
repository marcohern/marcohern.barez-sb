package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.DescripcionQuirurgica;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface DescripcionQuirurgicaRepository extends Repository<DescripcionQuirurgica, Integer> {
    Optional<DescripcionQuirurgica> findById(Integer id);
    List<DescripcionQuirurgica> findAll();
    Page<DescripcionQuirurgica> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
