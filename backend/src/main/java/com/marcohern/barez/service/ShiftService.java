package com.marcohern.barez.service;

import com.marcohern.barez.domain.entity.WorkShift;
import com.marcohern.barez.dto.response.ShiftAssignmentResponse;
import com.marcohern.barez.dto.response.ShiftResponse;

import java.util.List;

public interface ShiftService {
    ShiftResponse openShift(Long managerId);
    ShiftResponse closeShift(Long shiftId);
    ShiftAssignmentResponse assignWaiter(Long shiftId, Long waiterId);
    ShiftAssignmentResponse joinShift(Long waiterId);
    ShiftResponse getCurrentOpenShift();
    List<ShiftResponse> getAllShifts();
    WorkShift getCurrentOpenShiftEntity();
}
