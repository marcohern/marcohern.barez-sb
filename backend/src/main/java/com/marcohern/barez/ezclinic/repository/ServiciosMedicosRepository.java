package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.ServiciosMedicos;
import com.marcohern.barez.ezclinic.entity.ServiciosMedicosId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ServiciosMedicosRepository extends Repository<ServiciosMedicos, ServiciosMedicosId> {
    Optional<ServiciosMedicos> findById(ServiciosMedicosId id);
    List<ServiciosMedicos> findAll();
    Page<ServiciosMedicos> findAll(Pageable pageable);
    long count();
    boolean existsById(ServiciosMedicosId id);
}
