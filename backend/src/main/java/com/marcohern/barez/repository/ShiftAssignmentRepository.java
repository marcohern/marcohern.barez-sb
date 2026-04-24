package com.marcohern.barez.repository;

import com.marcohern.barez.domain.entity.ShiftAssignment;
import com.marcohern.barez.domain.entity.WorkShift;
import com.marcohern.barez.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ShiftAssignmentRepository extends JpaRepository<ShiftAssignment, Long> {
    boolean existsByShiftAndWaiter(WorkShift shift, User waiter);
    Optional<ShiftAssignment> findByShiftAndWaiter(WorkShift shift, User waiter);
    List<ShiftAssignment> findAllByShift(WorkShift shift);
}
