package com.marcohern.barez.service;

import com.marcohern.barez.dto.response.TableAssignmentResponse;

public interface TableAssignmentService {
    TableAssignmentResponse assignTableToWaiter(Long shiftId, Long tableId, Long waiterId);
    TableAssignmentResponse reassignWaiter(Long shiftId, Long tableId, Long newWaiterId);
    TableAssignmentResponse selfAssign(Long tableId, Long waiterId);
    TableAssignmentResponse moveTable(Long fromTableId, Long toTableId, Long requesterId);
}
