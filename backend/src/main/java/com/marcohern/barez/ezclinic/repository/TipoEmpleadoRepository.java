package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.TipoEmpleado;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface TipoEmpleadoRepository extends Repository<TipoEmpleado, Integer> {
    Optional<TipoEmpleado> findById(Integer id);
    List<TipoEmpleado> findAll();
    Page<TipoEmpleado> findAll(Pageable pageable);
    long count();
    boolean existsById(Integer id);
}
