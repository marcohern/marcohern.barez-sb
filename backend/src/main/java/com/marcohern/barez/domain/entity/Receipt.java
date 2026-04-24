package com.marcohern.barez.domain.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "receipts")
public class Receipt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false, unique = true)
    private Order order;

    @Column(nullable = false)
    private BigDecimal totalAmount;

    private String pdfPath;

    @Column(nullable = false)
    private LocalDateTime generatedAt = LocalDateTime.now();

    public Receipt() {}

    public Receipt(Order order, BigDecimal totalAmount) {
        this.order = order;
        this.totalAmount = totalAmount;
    }

    public Long getId() { return id; }
    public Order getOrder() { return order; }
    public BigDecimal getTotalAmount() { return totalAmount; }
    public String getPdfPath() { return pdfPath; }
    public void setPdfPath(String pdfPath) { this.pdfPath = pdfPath; }
    public LocalDateTime getGeneratedAt() { return generatedAt; }
}
