package com.po.dtos;

import java.time.LocalDateTime;

public record PoDetailDto(
        Long POID,
        LocalDateTime CREATED_AT,
        String DESC,
        String STT
) {
}
