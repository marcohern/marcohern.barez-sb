package com.marcohern.barez.ezclinic.repository;

import com.marcohern.barez.ezclinic.entity.DisponibilidadMedicos;
import com.marcohern.barez.ezclinic.entity.DisponibilidadMedicosId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface DisponibilidadMedicosRepository extends Repository<DisponibilidadMedicos, DisponibilidadMedicosId> {
    Optional<DisponibilidadMedicos> findById(DisponibilidadMedicosId id);
    List<DisponibilidadMedicos> findAll();
    Page<DisponibilidadMedicos> findAll(Pageable pageable);
    long count();
    boolean existsById(DisponibilidadMedicosId id);
}
