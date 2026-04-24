package com.marcohern.barez.dto.response;

import com.marcohern.barez.domain.entity.WorkShift;
import com.marcohern.barez.domain.enums.ShiftStatus;

import java.time.LocalDateTime;

public record ShiftResponse(Long id, LocalDateTime openedAt, LocalDateTime closedAt, ShiftStatus status, String openedByName) {
    public static ShiftResponse from(WorkShift s) {
        return new ShiftResponse(s.getId(), s.getOpenedAt(), s.getClosedAt(), s.getStatus(), s.getOpenedBy().getName());
    }
}
