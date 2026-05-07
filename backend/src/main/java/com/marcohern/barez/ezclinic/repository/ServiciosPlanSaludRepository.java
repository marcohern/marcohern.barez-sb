package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.ServiciosPlanSalud;
import com.marcohern.barez.ezclinic.entity.ServiciosPlanSaludId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ServiciosPlanSaludRepository extends Repository<ServiciosPlanSalud, ServiciosPlanSaludId> {
    Optional<ServiciosPlanSalud> findById(ServiciosPlanSaludId id);
    List<ServiciosPlanSalud> findAll();
    Page<ServiciosPlanSalud> findAll(Pageable pageable);
    long count();
    boolean existsById(ServiciosPlanSaludId id);
}
