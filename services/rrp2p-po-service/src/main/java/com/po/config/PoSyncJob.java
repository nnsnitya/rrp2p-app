package com.po.config;

import com.po.services.PoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class PoSyncJob {
    private final PoService poService;
    private final SapApiClient sapApiClient;

    @Scheduled(cron = "${app.cron.schedule}")
    public void syncJob() {
        try {
            poService.syncPurchaseOrders();
            log.info("SAP sync completed. Records processed");
        } catch (Exception e) {
            log.error("SAP purchase order sync failed", e);
        }
    }
}