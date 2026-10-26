package com.sap.services.impl;

import com.sap.constants.AppConstants;
import com.sap.dtos.PO_DATA;
import com.sap.entities.PoDetail;
import com.sap.mappers.PoDetailMapper;
import com.sap.repositories.PoDetailRepository;
import com.sap.services.PoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
//@RequiredArgsConstructor
public class PoServiceImpl implements PoService {

//    private final PoDetailRepository poDetailRepository;
//    private final PoDetailMapper poDetailMapper;
    @Autowired
    PoDetailRepository poDetailRepository;
    @Autowired
    PoDetailMapper poDetailMapper;

    @Override
    public List<PO_DATA> getLast30DaysRecords() {
        LocalDateTime startDate = LocalDateTime.now().minusDays(AppConstants.DAYS);
        List<PoDetail> recordsFromDate = poDetailRepository.findRecordsFromDate(startDate);
        return poDetailMapper.toDtoList(recordsFromDate);
    }
}
