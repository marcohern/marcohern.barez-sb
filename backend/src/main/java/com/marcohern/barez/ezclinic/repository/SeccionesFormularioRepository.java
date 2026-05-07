package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.SeccionesFormulario;
import com.marcohern.barez.ezclinic.entity.SeccionesFormularioId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface SeccionesFormularioRepository extends Repository<SeccionesFormulario, SeccionesFormularioId> {
    Optional<SeccionesFormulario> findById(SeccionesFormularioId id);
    List<SeccionesFormulario> findAll();
    Page<SeccionesFormulario> findAll(Pageable pageable);
    long count();
    boolean existsById(SeccionesFormularioId id);
}
