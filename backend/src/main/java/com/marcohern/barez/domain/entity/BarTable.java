package com.marcohern.barez.domain.entity;

import com.marcohern.barez.domain.enums.TableStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "tables")
public class BarTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private Integer tableNumber;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TableStatus status = TableStatus.AVAILABLE;

    @Column(nullable = false)
    private boolean active = true;

    public BarTable() {}

    public BarTable(Integer tableNumber) {
        this.tableNumber = tableNumber;
    }

    public Long getId() { return id; }
    public Integer getTableNumber() { return tableNumber; }
    public TableStatus getStatus() { return status; }
    public void setStatus(TableStatus status) { this.status = status; }
    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }
}
