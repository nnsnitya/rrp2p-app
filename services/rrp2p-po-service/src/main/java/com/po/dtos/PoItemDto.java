package com.po.dtos;

import java.time.LocalDateTime;

public record PoItemDto(
        Long POITM,
        Long PO_ID,
        LocalDateTime CREATED_AT,
        String DESC,
        String STT,
        Long MAT_ID,
        Long PLANT_ID,
        Long RECPT_ID,
        Long SCHEDULE_ID
) {
}
