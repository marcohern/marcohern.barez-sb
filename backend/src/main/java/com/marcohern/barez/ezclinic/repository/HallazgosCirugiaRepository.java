package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.HallazgosCirugia;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface HallazgosCirugiaRepository extends Repository<HallazgosCirugia, Integer> {
    Optional<HallazgosCirugia> findById(Integer id);
    List<HallazgosCirugia> findAll();
    Page<HallazgosCirugia> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
