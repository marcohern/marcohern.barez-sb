package com.marcohern.barez.controller;

import com.marcohern.barez.dto.request.CreateStaffRequest;
import com.marcohern.barez.dto.request.UpdateStaffRequest;
import com.marcohern.barez.dto.response.UserResponse;
import com.marcohern.barez.service.impl.StaffServiceImpl;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
@PreAuthorize("hasRole('MANAGER')")
public class StaffController {

    private final StaffServiceImpl staffService;

    public StaffController(StaffServiceImpl staffService) {
        this.staffService = staffService;
    }

    @PostMapping
    public ResponseEntity<UserResponse> create(@Valid @RequestBody CreateStaffRequest req) {
        return ResponseEntity.status(HttpStatus.CREATED).body(staffService.createStaff(req));
    }

    @GetMapping
    public ResponseEntity<List<UserResponse>> list() {
        return ResponseEntity.ok(staffService.getAllStaff());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> get(@PathVariable Long id) {
        return ResponseEntity.ok(staffService.getById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserResponse> update(@PathVariable Long id, @Valid @RequestBody UpdateStaffRequest req) {
        return ResponseEntity.ok(staffService.updateStaff(id, req));
    }
}
