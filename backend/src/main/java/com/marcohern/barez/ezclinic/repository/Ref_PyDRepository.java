package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.Ref_PyD;
import com.marcohern.barez.ezclinic.entity.Ref_PyDId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface Ref_PyDRepository extends Repository<Ref_PyD, Ref_PyDId> {
    Optional<Ref_PyD> findById(Ref_PyDId id);
    List<Ref_PyD> findAll();
    Page<Ref_PyD> findAll(Pageable pageable);
    long count();
    boolean existsById(Ref_PyDId id);
}
