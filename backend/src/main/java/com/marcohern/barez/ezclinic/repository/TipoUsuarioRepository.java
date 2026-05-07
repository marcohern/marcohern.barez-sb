package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.TipoUsuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface TipoUsuarioRepository extends Repository<TipoUsuario, Integer> {
    Optional<TipoUsuario> findById(Integer id);
    List<TipoUsuario> findAll();
    Page<TipoUsuario> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
