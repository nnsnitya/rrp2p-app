package com.po.dtos;

import java.time.LocalDateTime;

public record PoPlantDto(
        Long PLID,
        String NAME,
        Long ITM_ID,
        String ITM_NAME,
        LocalDateTime CREATED_AT,
        String LOC,
        String DESC,
        String STT
) {
}
