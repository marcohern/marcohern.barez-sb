package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.TipoDocumento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface TipoDocumentoRepository extends Repository<TipoDocumento, Integer> {
    Optional<TipoDocumento> findById(Integer id);
    List<TipoDocumento> findAll();
    Page<TipoDocumento> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
