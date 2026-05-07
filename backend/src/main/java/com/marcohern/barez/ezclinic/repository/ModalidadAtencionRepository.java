package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.ModalidadAtencion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ModalidadAtencionRepository extends Repository<ModalidadAtencion, Integer> {
    Optional<ModalidadAtencion> findById(Integer id);
    List<ModalidadAtencion> findAll();
    Page<ModalidadAtencion> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
