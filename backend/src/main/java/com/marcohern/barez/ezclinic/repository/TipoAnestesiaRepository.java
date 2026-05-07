package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.TipoAnestesia;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface TipoAnestesiaRepository extends Repository<TipoAnestesia, Integer> {
    Optional<TipoAnestesia> findById(Integer id);
    List<TipoAnestesia> findAll();
    Page<TipoAnestesia> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
