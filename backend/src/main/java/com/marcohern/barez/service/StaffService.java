package com.marcohern.barez.service;

import com.marcohern.barez.dto.request.CreateStaffRequest;
import com.marcohern.barez.dto.request.UpdateStaffRequest;
import com.marcohern.barez.dto.response.UserResponse;

import java.util.List;

public interface StaffService {
    UserResponse createStaff(CreateStaffRequest req);
    List<UserResponse> getAllStaff();
    UserResponse getById(Long id);
    UserResponse updateStaff(Long id, UpdateStaffRequest req);
}
