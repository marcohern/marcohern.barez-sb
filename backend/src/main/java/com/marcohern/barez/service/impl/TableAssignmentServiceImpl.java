package com.marcohern.barez.service.impl;

import com.marcohern.barez.domain.entity.*;
import com.marcohern.barez.domain.enums.Role;
import com.marcohern.barez.domain.enums.TableStatus;
import com.marcohern.barez.dto.response.TableAssignmentResponse;
import com.marcohern.barez.exception.ApiException;
import com.marcohern.barez.repository.*;
import com.marcohern.barez.service.ShiftService;
import com.marcohern.barez.service.TableAssignmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TableAssignmentServiceImpl implements TableAssignmentService {

    private final TableAssignmentRepository assignmentRepository;
    private final ShiftAssignmentRepository shiftAssignmentRepository;
    private final BarTableRepository tableRepository;
    private final UserRepository userRepository;
    private final ShiftService shiftService;

    public TableAssignmentServiceImpl(TableAssignmentRepository assignmentRepository,
                                      ShiftAssignmentRepository shiftAssignmentRepository,
                                      BarTableRepository tableRepository,
                                      UserRepository userRepository,
                                      ShiftService shiftService) {
        this.assignmentRepository = assignmentRepository;
        this.shiftAssignmentRepository = shiftAssignmentRepository;
        this.tableRepository = tableRepository;
        this.userRepository = userRepository;
        this.shiftService = shiftService;
    }

    @Transactional
    public TableAssignmentResponse assignTableToWaiter(Long shiftId, Long tableId, Long waiterId) {
        WorkShift shift = shiftService.getCurrentOpenShiftEntity();
        if (!shift.getId().equals(shiftId)) throw ApiException.badRequest("Shift is not open");

        BarTable table = findTableOrThrow(tableId);
        User waiter = findUserOrThrow(waiterId);

        ensureWaiterOnShift(shift, waiter);
        ensureTableNotAssigned(table, shift);

        table.setStatus(TableStatus.OCCUPIED);
        tableRepository.save(table);

        return TableAssignmentResponse.from(saveOrUpdate(table, waiter, shift));
    }

    @Transactional
    public TableAssignmentResponse reassignWaiter(Long shiftId, Long tableId, Long newWaiterId) {
        WorkShift shift = shiftService.getCurrentOpenShiftEntity();
        if (!shift.getId().equals(shiftId)) throw ApiException.badRequest("Shift is not open");

        BarTable table = findTableOrThrow(tableId);
        User newWaiter = findUserOrThrow(newWaiterId);
        ensureWaiterOnShift(shift, newWaiter);

        TableAssignment ta = assignmentRepository.findByTableAndShift(table, shift)
                .orElseThrow(() -> ApiException.notFound("Table is not assigned in this shift"));

        ta.setWaiter(newWaiter);
        return TableAssignmentResponse.from(assignmentRepository.save(ta));
    }

    @Transactional
    public TableAssignmentResponse selfAssign(Long tableId, Long waiterId) {
        WorkShift shift = shiftService.getCurrentOpenShiftEntity();
        BarTable table = findTableOrThrow(tableId);
        User waiter = findUserOrThrow(waiterId);

        ensureWaiterOnShift(shift, waiter);
        ensureTableNotAssigned(table, shift);

        table.setStatus(TableStatus.OCCUPIED);
        tableRepository.save(table);

        return TableAssignmentResponse.from(saveOrUpdate(table, waiter, shift));
    }

    @Transactional
    public TableAssignmentResponse moveTable(Long fromTableId, Long toTableId, Long requesterId) {
        WorkShift shift = shiftService.getCurrentOpenShiftEntity();
        BarTable fromTable = findTableOrThrow(fromTableId);
        BarTable toTable = findTableOrThrow(toTableId);
        User requester = findUserOrThrow(requesterId);

        TableAssignment fromAssignment = assignmentRepository.findByTableAndShift(fromTable, shift)
                .orElseThrow(() -> ApiException.notFound("Source table is not assigned"));

        if (requester.getRole() == Role.WAITER && !fromAssignment.getWaiter().getId().equals(requesterId))
            throw ApiException.forbidden("You can only move your own tables");

        if (toTable.getStatus() == TableStatus.OCCUPIED)
            throw ApiException.badRequest("Target table is already occupied");

        fromTable.setStatus(TableStatus.AVAILABLE);
        toTable.setStatus(TableStatus.OCCUPIED);
        tableRepository.save(fromTable);
        tableRepository.save(toTable);

        fromAssignment.setTable(toTable);
        return TableAssignmentResponse.from(assignmentRepository.save(fromAssignment));
    }

    private TableAssignment saveOrUpdate(BarTable table, User waiter, WorkShift shift) {
        return assignmentRepository.findByTableAndShift(table, shift)
                .map(existing -> {
                    existing.setWaiter(waiter);
                    return assignmentRepository.save(existing);
                })
                .orElseGet(() -> assignmentRepository.save(new TableAssignment(table, waiter, shift)));
    }

    private void ensureWaiterOnShift(WorkShift shift, User waiter) {
        if (!shiftAssignmentRepository.existsByShiftAndWaiter(shift, waiter))
            throw ApiException.badRequest("Waiter is not assigned to the current shift");
    }

    private void ensureTableNotAssigned(BarTable table, WorkShift shift) {
        if (assignmentRepository.existsByTableAndShift(table, shift))
            throw ApiException.conflict("Table is already assigned in this shift");
    }

    private BarTable findTableOrThrow(Long id) {
        return tableRepository.findById(id).orElseThrow(() -> ApiException.notFound("Table not found"));
    }

    private User findUserOrThrow(Long id) {
        return userRepository.findById(id).orElseThrow(() -> ApiException.notFound("User not found"));
    }
}
