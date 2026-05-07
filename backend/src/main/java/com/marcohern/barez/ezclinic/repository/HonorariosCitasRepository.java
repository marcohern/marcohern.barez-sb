package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.HonorariosCitas;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface HonorariosCitasRepository extends Repository<HonorariosCitas, Integer> {
    Optional<HonorariosCitas> findById(Integer id);
    List<HonorariosCitas> findAll();
    Page<HonorariosCitas> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
