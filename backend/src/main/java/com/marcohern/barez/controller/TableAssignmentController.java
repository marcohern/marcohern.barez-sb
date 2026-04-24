package com.marcohern.barez.controller;

import com.marcohern.barez.domain.entity.User;
import com.marcohern.barez.dto.request.AssignWaiterRequest;
import com.marcohern.barez.dto.request.MoveTableRequest;
import com.marcohern.barez.dto.response.TableAssignmentResponse;
import com.marcohern.barez.service.impl.TableAssignmentServiceImpl;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
public class TableAssignmentController {

    private final TableAssignmentServiceImpl assignmentService;

    public TableAssignmentController(TableAssignmentServiceImpl assignmentService) {
        this.assignmentService = assignmentService;
    }

    @PostMapping("/api/shifts/{shiftId}/tables/{tableId}/assign")
    @PreAuthorize("hasRole('MANAGER')")
    public ResponseEntity<TableAssignmentResponse> assign(@PathVariable Long shiftId,
                                                           @PathVariable Long tableId,
                                                           @Valid @RequestBody AssignWaiterRequest req) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(assignmentService.assignTableToWaiter(shiftId, tableId, req.waiterId()));
    }

    @PutMapping("/api/shifts/{shiftId}/tables/{tableId}/reassign-waiter")
    @PreAuthorize("hasRole('MANAGER')")
    public ResponseEntity<TableAssignmentResponse> reassign(@PathVariable Long shiftId,
                                                             @PathVariable Long tableId,
                                                             @Valid @RequestBody AssignWaiterRequest req) {
        return ResponseEntity.ok(assignmentService.reassignWaiter(shiftId, tableId, req.waiterId()));
    }

    @PostMapping("/api/tables/{tableId}/assign-self")
    @PreAuthorize("hasAnyRole('MANAGER','WAITER')")
    public ResponseEntity<TableAssignmentResponse> selfAssign(@PathVariable Long tableId, Authentication auth) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(assignmentService.selfAssign(tableId, currentUserId(auth)));
    }

    @PutMapping("/api/tables/{tableId}/move")
    @PreAuthorize("hasAnyRole('MANAGER','WAITER')")
    public ResponseEntity<TableAssignmentResponse> move(@PathVariable Long tableId,
                                                         @Valid @RequestBody MoveTableRequest req,
                                                         Authentication auth) {
        return ResponseEntity.ok(assignmentService.moveTable(tableId, req.toTableId(), currentUserId(auth)));
    }

    private Long currentUserId(Authentication auth) {
        return ((User) auth.getPrincipal()).getId();
    }
}
