package com.marcohern.barez.dto.response;

import com.marcohern.barez.domain.entity.BarTable;
import com.marcohern.barez.domain.enums.TableStatus;

public record TableResponse(Long id, Integer tableNumber, TableStatus status, boolean active) {
    public static TableResponse from(BarTable t) {
        return new TableResponse(t.getId(), t.getTableNumber(), t.getStatus(), t.isActive());
    }
}
