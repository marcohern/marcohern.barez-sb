package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Embarazo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface EmbarazoRepository extends Repository<Embarazo, Integer> {
    Optional<Embarazo> findById(Integer id);
    List<Embarazo> findAll();
    Page<Embarazo> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
