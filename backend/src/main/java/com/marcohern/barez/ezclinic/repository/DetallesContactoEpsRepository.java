package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.DetallesContactoEps;
import com.marcohern.barez.ezclinic.entity.DetallesContactoEpsId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface DetallesContactoEpsRepository extends Repository<DetallesContactoEps, DetallesContactoEpsId> {
    Optional<DetallesContactoEps> findById(DetallesContactoEpsId id);
    List<DetallesContactoEps> findAll();
    Page<DetallesContactoEps> findAll(Pageable pageable);
    long count();
    boolean existsById(DetallesContactoEpsId id);
}
