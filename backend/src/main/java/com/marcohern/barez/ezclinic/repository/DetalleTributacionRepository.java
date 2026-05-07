package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.DetalleTributacion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface DetalleTributacionRepository extends Repository<DetalleTributacion, Long> {
    Optional<DetalleTributacion> findById(Long id);
    List<DetalleTributacion> findAll();
    Page<DetalleTributacion> findAll(Pageable pageable);
    long count();
    boolean existsById(Long id);
}
