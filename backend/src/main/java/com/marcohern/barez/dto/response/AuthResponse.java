package com.marcohern.barez.dto.response;

import com.marcohern.barez.domain.enums.Role;

public record AuthResponse(String token, Long userId, String name, Role role) {}
