package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.FotosEmpleados;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface FotosEmpleadosRepository extends Repository<FotosEmpleados, Integer> {
    Optional<FotosEmpleados> findById(Integer id);
    List<FotosEmpleados> findAll();
    Page<FotosEmpleados> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
