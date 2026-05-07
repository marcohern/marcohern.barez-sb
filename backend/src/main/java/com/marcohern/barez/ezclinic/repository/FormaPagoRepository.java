package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.FormaPago;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface FormaPagoRepository extends Repository<FormaPago, Integer> {
    Optional<FormaPago> findById(Integer id);
    List<FormaPago> findAll();
    Page<FormaPago> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
