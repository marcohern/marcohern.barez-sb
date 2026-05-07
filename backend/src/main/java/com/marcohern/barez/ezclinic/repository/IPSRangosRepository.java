package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.IPSRangos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface IPSRangosRepository extends Repository<IPSRangos, Integer> {
    Optional<IPSRangos> findById(Integer id);
    List<IPSRangos> findAll();
    Page<IPSRangos> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
