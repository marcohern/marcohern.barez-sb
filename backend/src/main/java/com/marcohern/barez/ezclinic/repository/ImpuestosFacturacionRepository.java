package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.ImpuestosFacturacion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ImpuestosFacturacionRepository extends Repository<ImpuestosFacturacion, Long> {
    Optional<ImpuestosFacturacion> findById(Long id);
    List<ImpuestosFacturacion> findAll();
    Page<ImpuestosFacturacion> findAll(Pageable pageable);
    long count();
    boolean existsById(Long id);
}
