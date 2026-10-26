package com.sap.services;

import com.sap.dtos.PO_DATA;

import java.util.List;

public interface PoService {
    List<PO_DATA> getLast30DaysRecords();
}
