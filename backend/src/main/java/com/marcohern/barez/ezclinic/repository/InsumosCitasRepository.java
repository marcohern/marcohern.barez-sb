package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.InsumosCitas;
import com.marcohern.barez.ezclinic.entity.InsumosCitasId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface InsumosCitasRepository extends Repository<InsumosCitas, InsumosCitasId> {
    Optional<InsumosCitas> findById(InsumosCitasId id);
    List<InsumosCitas> findAll();
    Page<InsumosCitas> findAll(Pageable pageable);
    long count();
    boolean existsById(InsumosCitasId id);
}
