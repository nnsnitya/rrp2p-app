package com.sap.services.impl;

import com.sap.constants.AppConstants;
import com.sap.dtos.*;
import com.sap.entities.*;
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

    @Override
    public PoRespDto getLast30DaysRecords() {
        LocalDateTime startDate = LocalDateTime.now().minusDays(AppConstants.DAYS);
        List<PoDetail> poDetails = poDetailRepository.findRecordsFromDate(startDate);
        List<PoHistory> poHistorys = poHistoryRepository.findRecordsFromDate(startDate);
        List<PoItem> poItems = poItemRepository.findRecordsFromDate(startDate);
        List<PoMaterial> poMaterials = poMaterialRepository.findRecordsFromDate(startDate);
        List<PoPayment> poPayments = poPaymentRepository.findRecordsFromDate(startDate);
        List<PoPlant> poPlants = poPlantRepository.findRecordsFromDate(startDate);
        List<PoReceipt> poReceipts = poReceiptRepository.findRecordsFromDate(startDate);
//        List<PoSchedule> poSchedules = poScheduleRepository.findRecordsFromDate(startDate);
//        List<PoState> poStates = poStateRepository.findRecordsFromDate(startDate);
//        List<Storage> storages = storageRepository.findRecordsFromDate(startDate);
//        List<Vendor> vendors = vendorRepository.findRecordsFromDate(startDate);
        //put in all different dtos
        List<PoDetailDto> poDtos = poDetailMapper.toDtoList(poDetails);
        List<PoHistoryDto> poHistoryDtos = poHistoryMapper.toDtoList(poHistorys);
        List<PoItemDto> poItemDtos = poItemMapper.toDtoList(poItems);
        List<PoMaterialDto> poMaterialDtos = poMaterialMapper.toDtoList(poMaterials);
        List<PoPaymentDto> poPaymentDtos = poPaymentMapper.toDtoList(poPayments);
        List<PoPlantDto> poPlantDtos = poPlantMapper.toDtoList(poPlants);
        List<PoReceiptDto> poReceiptDtos = poReceiptMapper.toDtoList(poReceipts);


        return new PoRespDto(poDtos, poHistoryDtos, poItemDtos, poMaterialDtos,
                poPaymentDtos, poPlantDtos, poReceiptDtos, "PO");
    }
}
