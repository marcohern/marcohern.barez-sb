package com.marcohern.barez.dto.response;

import com.marcohern.barez.domain.entity.TableAssignment;

import java.time.LocalDateTime;

public record TableAssignmentResponse(Long id, Integer tableNumber, String waiterName, Long shiftId, LocalDateTime assignedAt) {
    public static TableAssignmentResponse from(TableAssignment ta) {
        return new TableAssignmentResponse(ta.getId(), ta.getTable().getTableNumber(), ta.getWaiter().getName(), ta.getShift().getId(), ta.getAssignedAt());
    }
}
