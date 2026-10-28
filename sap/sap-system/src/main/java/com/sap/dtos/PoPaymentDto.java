package com.sap.dtos;

import java.time.LocalDateTime;

public record PoPaymentDto(
        Long ID,
        Long PID,
        Long PITM,
        LocalDateTime PAIDON,
        String DESC,
        String STATUS
) {
}
