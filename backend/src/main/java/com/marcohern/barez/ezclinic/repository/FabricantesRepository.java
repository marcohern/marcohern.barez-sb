package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Fabricantes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface FabricantesRepository extends Repository<Fabricantes, Integer> {
    Optional<Fabricantes> findById(Integer id);
    List<Fabricantes> findAll();
    Page<Fabricantes> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
