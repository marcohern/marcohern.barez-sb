package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Tratamiento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface TratamientoRepository extends Repository<Tratamiento, Integer> {
    Optional<Tratamiento> findById(Integer id);
    List<Tratamiento> findAll();
    Page<Tratamiento> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
