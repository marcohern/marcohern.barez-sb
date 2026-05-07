package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Anestesia;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface AnestesiaRepository extends Repository<Anestesia, Integer> {
    Optional<Anestesia> findById(Integer id);
    List<Anestesia> findAll();
    Page<Anestesia> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
