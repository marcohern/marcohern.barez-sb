package com.marcohern.barez.dto.response;

import com.marcohern.barez.domain.entity.Product;

import java.math.BigDecimal;

public record ProductResponse(Long id, String name, String description, BigDecimal price, String category, boolean active) {
    public static ProductResponse from(Product p) {
        return new ProductResponse(p.getId(), p.getName(), p.getDescription(), p.getPrice(), p.getCategory(), p.isActive());
    }
}
