package com.marcohern.barez.repository;

import com.marcohern.barez.domain.entity.BarTable;
import com.marcohern.barez.domain.entity.TableAssignment;
import com.marcohern.barez.domain.entity.User;
import com.marcohern.barez.domain.entity.WorkShift;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TableAssignmentRepository extends JpaRepository<TableAssignment, Long> {
    Optional<TableAssignment> findByTableAndShift(BarTable table, WorkShift shift);
    List<TableAssignment> findAllByWaiterAndShift(User waiter, WorkShift shift);
    List<TableAssignment> findAllByShift(WorkShift shift);
    boolean existsByTableAndShift(BarTable table, WorkShift shift);
}
