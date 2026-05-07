package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.HRecienNacido;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface HRecienNacidoRepository extends Repository<HRecienNacido, Integer> {
    Optional<HRecienNacido> findById(Integer id);
    List<HRecienNacido> findAll();
    Page<HRecienNacido> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
