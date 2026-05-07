package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.ISS2002Rangos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ISS2002RangosRepository extends Repository<ISS2002Rangos, String> {
    Optional<ISS2002Rangos> findById(String id);
    List<ISS2002Rangos> findAll();
    Page<ISS2002Rangos> findAll(Pageable pageable);
    long count();
    boolean existsById(String id);
}
