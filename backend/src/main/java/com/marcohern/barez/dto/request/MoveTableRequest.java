package com.marcohern.barez.dto.request;

import jakarta.validation.constraints.NotNull;

public record MoveTableRequest(@NotNull Long toTableId) {}
