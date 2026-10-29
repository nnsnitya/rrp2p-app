package com.po.dtos;

import java.time.LocalDateTime;

public record VendorDto(
        Long ID,
        Long PO_ITM,
        LocalDateTime ADDED_AT,
        String LOC,
        String DESC,
        String STT
) {
}
