package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.CUPS;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface CUPSRepository extends Repository<CUPS, String> {
    Optional<CUPS> findById(String id);
    List<CUPS> findAll();
    Page<CUPS> findAll(Pageable pageable);
    long count();
    boolean existsById(String id);
}
