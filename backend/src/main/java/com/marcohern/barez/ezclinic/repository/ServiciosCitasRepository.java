package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.ServiciosCitas;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ServiciosCitasRepository extends Repository<ServiciosCitas, Integer> {
    Optional<ServiciosCitas> findById(Integer id);
    List<ServiciosCitas> findAll();
    Page<ServiciosCitas> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
