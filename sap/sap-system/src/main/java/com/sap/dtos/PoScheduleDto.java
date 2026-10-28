package com.sap.dtos;

import java.time.LocalDateTime;

public record PoScheduleDto(
        Long ID,
        Long PO_ITM,
        Long PO_ID,
        LocalDateTime CREATED_AT,
        LocalDateTime SCHEDULED_ON,
        String DESC,
        String STT
) {
}
