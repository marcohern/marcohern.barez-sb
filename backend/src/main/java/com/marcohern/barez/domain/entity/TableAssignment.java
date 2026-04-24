package com.marcohern.barez.domain.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "table_assignments")
public class TableAssignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "table_id", nullable = false)
    private BarTable table;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "waiter_id", nullable = false)
    private User waiter;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shift_id", nullable = false)
    private WorkShift shift;

    @Column(nullable = false)
    private LocalDateTime assignedAt = LocalDateTime.now();

    public TableAssignment() {}

    public TableAssignment(BarTable table, User waiter, WorkShift shift) {
        this.table = table;
        this.waiter = waiter;
        this.shift = shift;
    }

    public Long getId() { return id; }
    public BarTable getTable() { return table; }
    public void setTable(BarTable table) { this.table = table; }
    public User getWaiter() { return waiter; }
    public void setWaiter(User waiter) { this.waiter = waiter; }
    public WorkShift getShift() { return shift; }
    public LocalDateTime getAssignedAt() { return assignedAt; }
}
