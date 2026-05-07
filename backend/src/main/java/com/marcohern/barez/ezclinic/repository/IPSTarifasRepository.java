package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.IPSTarifas;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface IPSTarifasRepository extends Repository<IPSTarifas, Integer> {
    Optional<IPSTarifas> findById(Integer id);
    List<IPSTarifas> findAll();
    Page<IPSTarifas> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
