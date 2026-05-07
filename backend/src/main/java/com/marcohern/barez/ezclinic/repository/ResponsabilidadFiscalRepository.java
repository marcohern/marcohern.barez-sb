package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.ResponsabilidadFiscal;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ResponsabilidadFiscalRepository extends Repository<ResponsabilidadFiscal, Integer> {
    Optional<ResponsabilidadFiscal> findById(Integer id);
    List<ResponsabilidadFiscal> findAll();
    Page<ResponsabilidadFiscal> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
