package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.MedidasTiempo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface MedidasTiempoRepository extends Repository<MedidasTiempo, Integer> {
    Optional<MedidasTiempo> findById(Integer id);
    List<MedidasTiempo> findAll();
    Page<MedidasTiempo> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
