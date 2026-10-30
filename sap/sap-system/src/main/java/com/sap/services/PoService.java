package com.sap.services;

import com.sap.dtos.PoRespDto;

public interface PoService {
    PoRespDto getLast30DaysRecords();
}
