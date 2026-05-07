package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.ResponsabilidadesIPS;
import com.marcohern.barez.ezclinic.entity.ResponsabilidadesIPSId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ResponsabilidadesIPSRepository extends Repository<ResponsabilidadesIPS, ResponsabilidadesIPSId> {
    Optional<ResponsabilidadesIPS> findById(ResponsabilidadesIPSId id);
    List<ResponsabilidadesIPS> findAll();
    Page<ResponsabilidadesIPS> findAll(Pageable pageable);
    long count();
    boolean existsById(ResponsabilidadesIPSId id);
}
