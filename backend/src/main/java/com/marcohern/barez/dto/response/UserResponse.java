package com.marcohern.barez.dto.response;

import com.marcohern.barez.domain.entity.User;
import com.marcohern.barez.domain.enums.Role;

public record UserResponse(Long id, String name, String email, Role role, boolean active) {
    public static UserResponse from(User u) {
        return new UserResponse(u.getId(), u.getName(), u.getEmail(), u.getRole(), u.isActive());
    }
}
