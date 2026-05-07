package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.PersonalAtencion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface PersonalAtencionRepository extends Repository<PersonalAtencion, Integer> {
    Optional<PersonalAtencion> findById(Integer id);
    List<PersonalAtencion> findAll();
    Page<PersonalAtencion> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
