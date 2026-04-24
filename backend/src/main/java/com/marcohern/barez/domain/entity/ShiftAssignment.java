package com.marcohern.barez.domain.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "shift_assignments",
        uniqueConstraints = @UniqueConstraint(columnNames = {"shift_id", "waiter_id"}))
public class ShiftAssignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shift_id", nullable = false)
    private WorkShift shift;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "waiter_id", nullable = false)
    private User waiter;

    @Column(nullable = false)
    private LocalDateTime assignedAt = LocalDateTime.now();

    public ShiftAssignment() {}

    public ShiftAssignment(WorkShift shift, User waiter) {
        this.shift = shift;
        this.waiter = waiter;
    }

    public Long getId() { return id; }
    public WorkShift getShift() { return shift; }
    public User getWaiter() { return waiter; }
    public LocalDateTime getAssignedAt() { return assignedAt; }
}
