package com.marcohern.barez.dto.response;

import com.marcohern.barez.domain.entity.OrderItem;

import java.math.BigDecimal;

public record OrderItemResponse(Long id, String productName, Integer quantity, BigDecimal unitPrice, BigDecimal lineTotal) {
    public static OrderItemResponse from(OrderItem i) {
        return new OrderItemResponse(i.getId(), i.getProduct().getName(), i.getQuantity(), i.getUnitPrice(), i.lineTotal());
    }
}
