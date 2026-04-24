package com.marcohern.barez.dto.response;

import com.marcohern.barez.domain.entity.ShiftAssignment;

import java.time.LocalDateTime;

public record ShiftAssignmentResponse(Long id, Long shiftId, String waiterName, LocalDateTime assignedAt) {
    public static ShiftAssignmentResponse from(ShiftAssignment sa) {
        return new ShiftAssignmentResponse(sa.getId(), sa.getShift().getId(), sa.getWaiter().getName(), sa.getAssignedAt());
    }
}
