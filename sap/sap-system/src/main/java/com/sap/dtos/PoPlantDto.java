package com.sap.dtos;

import java.time.LocalDateTime;

public record PoPlantDto(
        Long PLID,
        String name,
        Long ITM_ID,
        String ITM_NAME,
        LocalDateTime CREATED_AT,
        String LOC,
        String DESC,
        String STT
) {
}
