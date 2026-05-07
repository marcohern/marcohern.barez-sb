package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.TipoAntecedente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface TipoAntecedenteRepository extends Repository<TipoAntecedente, Integer> {
    Optional<TipoAntecedente> findById(Integer id);
    List<TipoAntecedente> findAll();
    Page<TipoAntecedente> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
