package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.ServicioPadre;
import com.marcohern.barez.ezclinic.entity.ServicioPadreId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ServicioPadreRepository extends Repository<ServicioPadre, ServicioPadreId> {
    Optional<ServicioPadre> findById(ServicioPadreId id);
    List<ServicioPadre> findAll();
    Page<ServicioPadre> findAll(Pageable pageable);
    long count();
    boolean existsById(ServicioPadreId id);
}
