package com.marcohern.barez.repository;

import com.marcohern.barez.domain.entity.WorkShift;
import com.marcohern.barez.domain.enums.ShiftStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WorkShiftRepository extends JpaRepository<WorkShift, Long> {
    Optional<WorkShift> findFirstByStatus(ShiftStatus status);
    boolean existsByStatus(ShiftStatus status);
}
