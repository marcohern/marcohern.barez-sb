package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.ExamenesSolicitudes;
import com.marcohern.barez.ezclinic.entity.ExamenesSolicitudesId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ExamenesSolicitudesRepository extends Repository<ExamenesSolicitudes, ExamenesSolicitudesId> {
    Optional<ExamenesSolicitudes> findById(ExamenesSolicitudesId id);
    List<ExamenesSolicitudes> findAll();
    Page<ExamenesSolicitudes> findAll(Pageable pageable);
    long count();
    boolean existsById(ExamenesSolicitudesId id);
}
