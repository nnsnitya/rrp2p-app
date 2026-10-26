package com.sap.dtos;

import java.time.LocalDateTime;

public record PO_DATA(
        Long poId,
        LocalDateTime createdAt,
        String description,
        String state
) {
}
