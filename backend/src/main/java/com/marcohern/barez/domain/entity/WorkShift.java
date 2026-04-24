package com.marcohern.barez.domain.entity;

import com.marcohern.barez.domain.enums.ShiftStatus;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "work_shifts")
public class WorkShift {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime openedAt = LocalDateTime.now();

    private LocalDateTime closedAt;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ShiftStatus status = ShiftStatus.OPEN;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "opened_by_id", nullable = false)
    private User openedBy;

    public WorkShift() {}

    public WorkShift(User openedBy) {
        this.openedBy = openedBy;
    }

    public Long getId() { return id; }
    public LocalDateTime getOpenedAt() { return openedAt; }
    public LocalDateTime getClosedAt() { return closedAt; }
    public void setClosedAt(LocalDateTime closedAt) { this.closedAt = closedAt; }
    public ShiftStatus getStatus() { return status; }
    public void setStatus(ShiftStatus status) { this.status = status; }
    public User getOpenedBy() { return openedBy; }
}
