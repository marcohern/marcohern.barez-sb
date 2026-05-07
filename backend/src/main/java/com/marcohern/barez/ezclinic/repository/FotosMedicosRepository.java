package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.FotosMedicos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface FotosMedicosRepository extends Repository<FotosMedicos, Integer> {
    Optional<FotosMedicos> findById(Integer id);
    List<FotosMedicos> findAll();
    Page<FotosMedicos> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
