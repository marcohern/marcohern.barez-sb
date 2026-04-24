package com.marcohern.barez.service.impl;

import com.marcohern.barez.domain.entity.User;
import com.marcohern.barez.dto.request.CreateStaffRequest;
import com.marcohern.barez.dto.request.UpdateStaffRequest;
import com.marcohern.barez.dto.response.UserResponse;
import com.marcohern.barez.exception.ApiException;
import com.marcohern.barez.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public StaffServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public UserResponse createStaff(CreateStaffRequest req) {
        if (userRepository.existsByEmail(req.email()))
            throw ApiException.conflict("Email already in use");

        User user = new User(req.name(), req.email(), passwordEncoder.encode(req.password()), req.role());
        return UserResponse.from(userRepository.save(user));
    }

    public List<UserResponse> getAllStaff() {
        return userRepository.findAll().stream().map(UserResponse::from).toList();
    }

    public UserResponse getById(Long id) {
        return UserResponse.from(findOrThrow(id));
    }

    public UserResponse updateStaff(Long id, UpdateStaffRequest req) {
        User user = findOrThrow(id);
        user.setName(req.name());
        user.setRole(req.role());
        user.setActive(req.active());
        return UserResponse.from(userRepository.save(user));
    }

    private User findOrThrow(Long id) {
        return userRepository.findById(id).orElseThrow(() -> ApiException.notFound("Staff not found"));
    }
}
