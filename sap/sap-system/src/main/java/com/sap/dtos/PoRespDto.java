package com.sap.dtos;

import java.util.List;

public record PoRespDto(
        List<PoDetailDto> PO_DATA,
        List<PoHistoryDto> HISTORY,
        List<PoItemDto> PO_ITMS,
        List<PoMaterialDto> MATERIAL,
        List<PoPaymentDto> PAYMNT,
        List<PoPlantDto> PLANT,
        List<PoReceiptDto> RCPT,
        List<PoScheduleDto> SCHEDULE,
        List<PoStateDto> PO_STATE,
        List<StorageDto> STORE,
        List<VendorDto> VENDOR,
        String TYPE
        ) {
}
