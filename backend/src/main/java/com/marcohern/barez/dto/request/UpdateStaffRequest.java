package com.marcohern.barez.dto.request;

import com.marcohern.barez.domain.enums.Role;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UpdateStaffRequest(
        @NotBlank String name,
        @NotNull Role role,
        @NotNull Boolean active
) {}
