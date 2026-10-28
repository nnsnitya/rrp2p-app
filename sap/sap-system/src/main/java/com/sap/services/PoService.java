package com.sap.services;

import com.sap.dtos.PoDetailDto;
import com.sap.dtos.PoRespDto;

import java.util.List;

public interface PoService {
    PoRespDto getLast30DaysRecords();
}
