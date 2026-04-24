package com.marcohern.barez.dto.response;

import com.marcohern.barez.domain.entity.Order;
import com.marcohern.barez.domain.enums.OrderStatus;

import java.time.LocalDateTime;
import java.util.List;

public record OrderResponse(Long id, Long tableId, Integer tableNumber, Long shiftId, OrderStatus status,
                            LocalDateTime createdAt, LocalDateTime closedAt, List<OrderItemResponse> items) {
    public static OrderResponse from(Order o) {
        var items = o.getItems().stream().map(OrderItemResponse::from).toList();
        return new OrderResponse(o.getId(), o.getTable().getId(), o.getTable().getTableNumber(),
                o.getShift().getId(), o.getStatus(), o.getCreatedAt(), o.getClosedAt(), items);
    }
}
