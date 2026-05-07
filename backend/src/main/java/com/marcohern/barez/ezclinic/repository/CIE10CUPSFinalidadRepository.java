package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.CIE10CUPSFinalidad;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface CIE10CUPSFinalidadRepository extends Repository<CIE10CUPSFinalidad, Integer> {
    Optional<CIE10CUPSFinalidad> findById(Integer id);
    List<CIE10CUPSFinalidad> findAll();
    Page<CIE10CUPSFinalidad> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
