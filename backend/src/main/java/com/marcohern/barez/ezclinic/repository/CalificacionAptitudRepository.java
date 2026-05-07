package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.CalificacionAptitud;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface CalificacionAptitudRepository extends Repository<CalificacionAptitud, Integer> {
    Optional<CalificacionAptitud> findById(Integer id);
    List<CalificacionAptitud> findAll();
    Page<CalificacionAptitud> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
