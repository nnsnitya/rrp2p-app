package com.sap.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public record StorageDto(
        @JsonProperty()
        Long ID,
        LocalDateTime CREATED_AT,
        String LOC,
        String DESC,
        String STT
) {
}
