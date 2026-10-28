package com.sap.dtos;

import java.time.LocalDateTime;

public record PoStateDto(
        Long ID,
        Long PO_ID,
        String STATE,
        LocalDateTime UPDATON
) {
}
