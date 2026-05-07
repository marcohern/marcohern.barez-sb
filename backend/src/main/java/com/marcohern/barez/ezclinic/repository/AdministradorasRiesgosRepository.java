package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.AdministradorasRiesgos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface AdministradorasRiesgosRepository extends Repository<AdministradorasRiesgos, Integer> {
    Optional<AdministradorasRiesgos> findById(Integer id);
    List<AdministradorasRiesgos> findAll();
    Page<AdministradorasRiesgos> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
