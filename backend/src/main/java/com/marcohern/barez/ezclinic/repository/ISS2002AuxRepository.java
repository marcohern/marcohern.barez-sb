package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.ISS2002Aux;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ISS2002AuxRepository extends Repository<ISS2002Aux, String> {
    Optional<ISS2002Aux> findById(String id);
    List<ISS2002Aux> findAll();
    Page<ISS2002Aux> findAll(Pageable pageable);
    long count();
    boolean existsById(String id);
}
