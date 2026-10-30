package com.po.services.impl;

import com.po.config.SapApiClient;
import com.po.dtos.PoRespDto;
import com.po.entities.PoDetail;
import com.po.entities.PoHistory;
import com.po.entities.PoItem;
import com.po.mappers.PoDetailMapper;
import com.po.mappers.PoHistoryMapper;
import com.po.mappers.PoItemMapper;
import com.po.repositories.PoDetailRepository;
import com.po.repositories.PoHistoryRepository;
import com.po.repositories.PoItemRepository;
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

    private final PoDetailMapper poMapper;
    private final PoHistoryMapper historyMapper;
    private final PoItemMapper itemMapper;


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


        List<PoDetail> poDetails = poDetailRepo.saveAll(poMapper.toEntityList(respObj.PO_DATA()));
        List<PoHistory> poHistories = historyRepo.saveAll(historyMapper.toEntityList(respObj.HISTORY()));
        List<PoItem> poItems = itemRepo.saveAll(itemMapper.toEntityList(respObj.PO_ITMS()));
        
    }
}
