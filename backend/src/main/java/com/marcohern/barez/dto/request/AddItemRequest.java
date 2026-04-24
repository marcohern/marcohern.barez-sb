package com.marcohern.barez.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record AddItemRequest(
        @NotNull Long productId,
        @NotNull @Min(1) Integer quantity
) {}
