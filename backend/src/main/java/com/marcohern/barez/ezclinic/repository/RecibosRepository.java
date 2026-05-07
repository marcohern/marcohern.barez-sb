package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Recibos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface RecibosRepository extends Repository<Recibos, Integer> {
    Optional<Recibos> findById(Integer id);
    List<Recibos> findAll();
    Page<Recibos> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
