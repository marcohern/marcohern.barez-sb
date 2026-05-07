package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.FacturacionVirtualEPS;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface FacturacionVirtualEPSRepository extends Repository<FacturacionVirtualEPS, Integer> {
    Optional<FacturacionVirtualEPS> findById(Integer id);
    List<FacturacionVirtualEPS> findAll();
    Page<FacturacionVirtualEPS> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
