package com.po.dtos;

import java.time.LocalDateTime;

public record PoHistoryDto(
        Long ID,
        Long PO_ITM,
        Long PO_ID,
        LocalDateTime CREATED_AT,
        String DESC,
        String STT
) {
}
