package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.EntidadSMDLV;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface EntidadSMDLVRepository extends Repository<EntidadSMDLV, Integer> {
    Optional<EntidadSMDLV> findById(Integer id);
    List<EntidadSMDLV> findAll();
    Page<EntidadSMDLV> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
