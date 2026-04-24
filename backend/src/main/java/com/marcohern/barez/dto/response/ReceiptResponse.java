package com.marcohern.barez.dto.response;

import com.marcohern.barez.domain.entity.Receipt;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ReceiptResponse(Long id, Long orderId, BigDecimal totalAmount, LocalDateTime generatedAt, String pdfUrl) {
    public static ReceiptResponse from(Receipt r) {
        return new ReceiptResponse(r.getId(), r.getOrder().getId(), r.getTotalAmount(), r.getGeneratedAt(),
                "/api/receipts/" + r.getId() + "/pdf");
    }
}
