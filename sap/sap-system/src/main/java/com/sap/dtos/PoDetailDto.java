package com.sap.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public record PoDetailDto(
        @JsonProperty()
        Long POID,
        LocalDateTime CREATED_AT,
        String DESC,
        String STT
) {
}
