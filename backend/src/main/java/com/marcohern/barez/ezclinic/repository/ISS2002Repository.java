package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.ISS2002;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ISS2002Repository extends Repository<ISS2002, String> {
    Optional<ISS2002> findById(String id);
    List<ISS2002> findAll();
    Page<ISS2002> findAll(Pageable pageable);
    long count();
    boolean existsById(String id);
}
