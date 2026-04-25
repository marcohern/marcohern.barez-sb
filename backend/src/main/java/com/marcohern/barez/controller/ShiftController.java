package com.marcohern.barez.controller;

import com.marcohern.barez.domain.entity.User;
import com.marcohern.barez.dto.request.AssignWaiterRequest;
import com.marcohern.barez.dto.response.ShiftAssignmentResponse;
import com.marcohern.barez.dto.response.ShiftResponse;
import com.marcohern.barez.service.ShiftService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shifts")
public class ShiftController {

    private final ShiftService shiftService;

    public ShiftController(ShiftService shiftService) {
        this.shiftService = shiftService;
    }

    @PostMapping
    @PreAuthorize("hasRole('MANAGER')")
    public ResponseEntity<ShiftResponse> open(Authentication auth) {
        return ResponseEntity.status(HttpStatus.CREATED).body(shiftService.openShift(currentUserId(auth)));
    }

    @PutMapping("/{id}/close")
    @PreAuthorize("hasRole('MANAGER')")
    public ResponseEntity<ShiftResponse> close(@PathVariable Long id) {
        return ResponseEntity.ok(shiftService.closeShift(id));
    }

    @PostMapping("/{id}/assign-waiter")
    @PreAuthorize("hasRole('MANAGER')")
    public ResponseEntity<ShiftAssignmentResponse> assignWaiter(@PathVariable Long id,
                                                                 @Valid @RequestBody AssignWaiterRequest req) {
        return ResponseEntity.status(HttpStatus.CREATED).body(shiftService.assignWaiter(id, req.waiterId()));
    }

    @PostMapping("/join")
    @PreAuthorize("hasRole('WAITER')")
    public ResponseEntity<ShiftAssignmentResponse> join(Authentication auth) {
        return ResponseEntity.status(HttpStatus.CREATED).body(shiftService.joinShift(currentUserId(auth)));
    }

    @GetMapping("/current")
    @PreAuthorize("hasAnyRole('MANAGER','WAITER')")
    public ResponseEntity<ShiftResponse> current() {
        return ResponseEntity.ok(shiftService.getCurrentOpenShift());
    }

    @GetMapping
    @PreAuthorize("hasRole('MANAGER')")
    public ResponseEntity<List<ShiftResponse>> list() {
        return ResponseEntity.ok(shiftService.getAllShifts());
    }

    private Long currentUserId(Authentication auth) {
        return ((User) auth.getPrincipal()).getId();
    }
}
