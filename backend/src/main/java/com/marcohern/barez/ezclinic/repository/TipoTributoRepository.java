package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.TipoTributo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface TipoTributoRepository extends Repository<TipoTributo, Integer> {
    Optional<TipoTributo> findById(Integer id);
    List<TipoTributo> findAll();
    Page<TipoTributo> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
