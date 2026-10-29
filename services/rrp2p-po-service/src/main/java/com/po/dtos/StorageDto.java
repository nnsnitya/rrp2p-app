package com.po.dtos;

import java.time.LocalDateTime;

public record StorageDto(
        Long ID,
        LocalDateTime CREATED_AT,
        String LOC,
        String DESC,
        String STT
) {
}
