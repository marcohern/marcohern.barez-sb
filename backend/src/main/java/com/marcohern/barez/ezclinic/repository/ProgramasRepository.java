package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Programas;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ProgramasRepository extends Repository<Programas, Integer> {
    Optional<Programas> findById(Integer id);
    List<Programas> findAll();
    Page<Programas> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
