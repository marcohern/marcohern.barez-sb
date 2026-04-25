package com.marcohern.barez.service.impl;

import com.marcohern.barez.domain.entity.ShiftAssignment;
import com.marcohern.barez.domain.entity.User;
import com.marcohern.barez.domain.entity.WorkShift;
import com.marcohern.barez.domain.enums.OrderStatus;
import com.marcohern.barez.domain.enums.ShiftStatus;
import com.marcohern.barez.dto.response.ShiftAssignmentResponse;
import com.marcohern.barez.dto.response.ShiftResponse;
import com.marcohern.barez.exception.ApiException;
import com.marcohern.barez.repository.OrderRepository;
import com.marcohern.barez.repository.ShiftAssignmentRepository;
import com.marcohern.barez.repository.UserRepository;
import com.marcohern.barez.repository.WorkShiftRepository;
import com.marcohern.barez.service.ShiftService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ShiftServiceImpl implements ShiftService {

    private final WorkShiftRepository shiftRepository;
    private final ShiftAssignmentRepository assignmentRepository;
    private final UserRepository userRepository;
    private final OrderRepository orderRepository;

    public ShiftServiceImpl(WorkShiftRepository shiftRepository,
                            ShiftAssignmentRepository assignmentRepository,
                            UserRepository userRepository,
                            OrderRepository orderRepository) {
        this.shiftRepository = shiftRepository;
        this.assignmentRepository = assignmentRepository;
        this.userRepository = userRepository;
        this.orderRepository = orderRepository;
    }

    @Transactional
    public ShiftResponse openShift(Long managerId) {
        if (shiftRepository.existsByStatus(ShiftStatus.OPEN))
            throw ApiException.conflict("A shift is already open");

        User manager = findUserOrThrow(managerId);
        return ShiftResponse.from(shiftRepository.save(new WorkShift(manager)));
    }

    @Transactional
    public ShiftResponse closeShift(Long shiftId) {
        WorkShift shift = findShiftOrThrow(shiftId);
        if (shift.getStatus() == ShiftStatus.CLOSED)
            throw ApiException.badRequest("Shift is already closed");

        if (orderRepository.existsByShiftAndStatus(shift, OrderStatus.OPEN))
            throw ApiException.badRequest("Cannot close shift: there are still open orders");

        shift.setStatus(ShiftStatus.CLOSED);
        shift.setClosedAt(LocalDateTime.now());
        return ShiftResponse.from(shiftRepository.save(shift));
    }

    @Transactional
    public ShiftAssignmentResponse assignWaiter(Long shiftId, Long waiterId) {
        WorkShift shift = findOpenShiftOrThrow(shiftId);
        User waiter = findUserOrThrow(waiterId);

        if (assignmentRepository.existsByShiftAndWaiter(shift, waiter))
            throw ApiException.conflict("Waiter is already assigned to this shift");

        return ShiftAssignmentResponse.from(assignmentRepository.save(new ShiftAssignment(shift, waiter)));
    }

    @Transactional
    public ShiftAssignmentResponse joinShift(Long waiterId) {
        WorkShift shift = shiftRepository.findFirstByStatus(ShiftStatus.OPEN)
                .orElseThrow(() -> ApiException.badRequest("No open shift available"));

        User waiter = findUserOrThrow(waiterId);

        if (assignmentRepository.existsByShiftAndWaiter(shift, waiter))
            throw ApiException.conflict("You are already on this shift");

        return ShiftAssignmentResponse.from(assignmentRepository.save(new ShiftAssignment(shift, waiter)));
    }

    public ShiftResponse getCurrentOpenShift() {
        return shiftRepository.findFirstByStatus(ShiftStatus.OPEN)
                .map(ShiftResponse::from)
                .orElseThrow(() -> ApiException.notFound("No open shift"));
    }

    public List<ShiftResponse> getAllShifts() {
        return shiftRepository.findAll().stream().map(ShiftResponse::from).toList();
    }

    public WorkShift getCurrentOpenShiftEntity() {
        return shiftRepository.findFirstByStatus(ShiftStatus.OPEN)
                .orElseThrow(() -> ApiException.badRequest("No open shift"));
    }

    private WorkShift findShiftOrThrow(Long id) {
        return shiftRepository.findById(id).orElseThrow(() -> ApiException.notFound("Shift not found"));
    }

    private WorkShift findOpenShiftOrThrow(Long id) {
        WorkShift shift = findShiftOrThrow(id);
        if (shift.getStatus() != ShiftStatus.OPEN) throw ApiException.badRequest("Shift is not open");
        return shift;
    }

    private User findUserOrThrow(Long id) {
        return userRepository.findById(id).orElseThrow(() -> ApiException.notFound("User not found"));
    }
}
