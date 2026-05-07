package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.RequerirInsumos;
import com.marcohern.barez.ezclinic.entity.RequerirInsumosId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface RequerirInsumosRepository extends Repository<RequerirInsumos, RequerirInsumosId> {
    Optional<RequerirInsumos> findById(RequerirInsumosId id);
    List<RequerirInsumos> findAll();
    Page<RequerirInsumos> findAll(Pageable pageable);
    long count();
    boolean existsById(RequerirInsumosId id);
}
