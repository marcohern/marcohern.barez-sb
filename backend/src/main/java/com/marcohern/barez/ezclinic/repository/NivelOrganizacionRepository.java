package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.NivelOrganizacion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface NivelOrganizacionRepository extends Repository<NivelOrganizacion, Integer> {
    Optional<NivelOrganizacion> findById(Integer id);
    List<NivelOrganizacion> findAll();
    Page<NivelOrganizacion> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
