package com.marcohern.barez.repository;

import com.marcohern.barez.domain.entity.BarTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BarTableRepository extends JpaRepository<BarTable, Long> {
    boolean existsByTableNumber(Integer tableNumber);
    List<BarTable> findAllByActiveTrue();
}
