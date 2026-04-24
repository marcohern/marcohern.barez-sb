package com.marcohern.barez.repository;

import com.marcohern.barez.domain.entity.BarTable;
import com.marcohern.barez.domain.entity.Order;
import com.marcohern.barez.domain.entity.WorkShift;
import com.marcohern.barez.domain.enums.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Optional<Order> findByTableAndShiftAndStatus(BarTable table, WorkShift shift, OrderStatus status);
    boolean existsByShiftAndStatus(WorkShift shift, OrderStatus status);
}
