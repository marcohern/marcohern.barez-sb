package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Contactos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ContactosRepository extends Repository<Contactos, Integer> {
    Optional<Contactos> findById(Integer id);
    List<Contactos> findAll();
    Page<Contactos> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
