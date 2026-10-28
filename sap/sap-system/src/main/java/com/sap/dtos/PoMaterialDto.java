package com.sap.dtos;

import java.time.LocalDateTime;

public record PoMaterialDto(
        Long ID,
        Long PO_ITM,
        LocalDateTime CREATED_AT,
        String LOC,
        String DESC,
        String STT
) {
}
