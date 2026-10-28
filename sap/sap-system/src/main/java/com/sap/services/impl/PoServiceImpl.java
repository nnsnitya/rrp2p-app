package com.sap.services.impl;

import com.sap.constants.AppConstants;
import com.sap.dtos.*;
import com.sap.mappers.*;
import com.sap.repositories.*;
import com.sap.services.PoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PoServiceImpl implements PoService {

    private final PoDetailRepository poDetailRepository;
    private final PoHistoryRepository poHistoryRepository;
    private final PoItemRepository poItemRepository;
    private final PoMaterialRepository poMaterialRepository;
    private final PoPaymentRepository poPaymentRepository;
    private final PoPlantRepository poPlantRepository;
    private final PoReceiptRepository poReceiptRepository;
    private final PoScheduleRepository poScheduleRepository;
    private final PoStateRepository poStateRepository;
    private final StorageRepository storageRepository;
    private final VendorRepository vendorRepository;

    private final PoDetailMapper poDetailMapper;
    private final PoHistoryMapper poHistoryMapper;
    private final PoItemMapper poItemMapper;
    private final PoMaterialMapper poMaterialMapper;
    private final PoPaymentMapper poPaymentMapper;
    private final PoPlantMapper poPlantMapper;
    private final PoReceiptMapper poReceiptMapper;
    private final PoScheduleMapper poScheduleMapper;
    private final PoStateMapper poStateMapper;
    private final StorageMapper storageMapper;
    private final VendorMapper vendorMapper;

    @Override
    public PoRespDto getLast30DaysRecords() {
        LocalDateTime startDate = LocalDateTime.now().minusDays(AppConstants.DAYS);

        //put in all different dtos
        List<PoDetailDto> poDtos = poDetailMapper.toDtoList(poDetailRepository.findRecordsFromDate(startDate));
        List<PoHistoryDto> poHistoryDtos = poHistoryMapper.toDtoList(poHistoryRepository.findRecordsFromDate(startDate));
        List<PoItemDto> poItemDtos = poItemMapper.toDtoList(poItemRepository.findRecordsFromDate(startDate));
        List<PoMaterialDto> poMaterialDtos = poMaterialMapper.toDtoList(poMaterialRepository.findRecordsFromDate(startDate));
        List<PoPaymentDto> poPaymentDtos = poPaymentMapper.toDtoList(poPaymentRepository.findRecordsFromDate(startDate));
        List<PoPlantDto> poPlantDtos = poPlantMapper.toDtoList(poPlantRepository.findRecordsFromDate(startDate));
        List<PoReceiptDto> poReceiptDtos = poReceiptMapper.toDtoList(poReceiptRepository.findRecordsFromDate(startDate));
        List<PoScheduleDto> poScheduleDtos = poScheduleMapper.toDtoList(poScheduleRepository.findRecordsFromDate(startDate));
        List<PoStateDto> poStateDtos = poStateMapper.toDtoList(poStateRepository.findRecordsFromDate(startDate));
        List<StorageDto> storageDtos = storageMapper.toDtoList(storageRepository.findRecordsFromDate(startDate));
        List<VendorDto> vendorDtos = vendorMapper.toDtoList(vendorRepository.findRecordsFromDate(startDate));

        return new PoRespDto(poDtos, poHistoryDtos, poItemDtos, poMaterialDtos,
                poPaymentDtos, poPlantDtos, poReceiptDtos, poScheduleDtos,
                poStateDtos, storageDtos, vendorDtos, "PO");
    }
}
