package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.RiesgosEmpresa;
import com.marcohern.barez.ezclinic.entity.RiesgosEmpresaId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface RiesgosEmpresaRepository extends Repository<RiesgosEmpresa, RiesgosEmpresaId> {
    Optional<RiesgosEmpresa> findById(RiesgosEmpresaId id);
    List<RiesgosEmpresa> findAll();
    Page<RiesgosEmpresa> findAll(Pageable pageable);
    long count();
    boolean existsById(RiesgosEmpresaId id);
}
