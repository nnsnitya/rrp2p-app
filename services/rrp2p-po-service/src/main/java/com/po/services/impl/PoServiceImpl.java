package com.po.services.impl;

import com.po.config.SapApiClient;
import com.po.dtos.PoRespDto;
import com.po.entities.*;
import com.po.mappers.*;
import com.po.repositories.*;
import com.po.services.PoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PoServiceImpl implements PoService {

    private final SapApiClient sapApiClient;
    private final ObjectMapper objectMapper;

    private final PoDetailRepository poDetailRepo;
    private final PoHistoryRepository historyRepo;
    private final PoItemRepository itemRepo;
    private final PoMaterialRepository materialRepo;
    private final PoPaymentRepository paymentRepo;

    private final PoDetailMapper poMapper;
    private final PoHistoryMapper historyMapper;
    private final PoItemMapper itemMapper;
    private final PoMaterialMapper materialMapper;
    private final PoPaymentMapper paymentMapper;


    //save po detail
//    public void savePoDetail(List<PO_DATA> poDataList)

    @Override
    public void syncPurchaseOrders() throws Exception {
        String respJson = sapApiClient.fetchPurchaseOrders();
        PoRespDto respObj = objectMapper.readValue(
                respJson,
                new TypeReference<PoRespDto>() {

                }
        );
        System.out.println(respObj.PO_DATA());
        System.out.println(respObj.HISTORY());
        System.out.println(respObj.PO_ITMS());
        System.out.println(respObj.MATERIAL());
        System.out.println(respObj.PAYMNT());

        List<PoDetail> poDetails = poDetailRepo.saveAll(poMapper.toEntityList(respObj.PO_DATA()));
        List<PoHistory> histories = historyRepo.saveAll(historyMapper.toEntityList(respObj.HISTORY()));
        List<PoItem> items = itemRepo.saveAll(itemMapper.toEntityList(respObj.PO_ITMS()));
        List<PoMaterial> materials = materialRepo.saveAll(materialMapper.toEntityList(respObj.MATERIAL()));
        List<PoPayment> payments = paymentRepo.saveAll(paymentMapper.toEntityList(respObj.PAYMNT()));

    }
}
