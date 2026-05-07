package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.RequerirRecursos;
import com.marcohern.barez.ezclinic.entity.RequerirRecursosId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface RequerirRecursosRepository extends Repository<RequerirRecursos, RequerirRecursosId> {
    Optional<RequerirRecursos> findById(RequerirRecursosId id);
    List<RequerirRecursos> findAll();
    Page<RequerirRecursos> findAll(Pageable pageable);
    long count();
    boolean existsById(RequerirRecursosId id);
}
