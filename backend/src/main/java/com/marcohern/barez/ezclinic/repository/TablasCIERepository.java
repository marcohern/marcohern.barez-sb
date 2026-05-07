package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.TablasCIE;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface TablasCIERepository extends Repository<TablasCIE, Integer> {
    Optional<TablasCIE> findById(Integer id);
    List<TablasCIE> findAll();
    Page<TablasCIE> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
