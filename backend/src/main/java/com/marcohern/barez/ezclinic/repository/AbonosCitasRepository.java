package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.AbonosCitas;
import com.marcohern.barez.ezclinic.entity.AbonosCitasId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface AbonosCitasRepository extends Repository<AbonosCitas, AbonosCitasId> {
    Optional<AbonosCitas> findById(AbonosCitasId id);
    List<AbonosCitas> findAll();
    Page<AbonosCitas> findAll(Pageable pageable);
    long count();
    boolean existsById(AbonosCitasId id);
}
