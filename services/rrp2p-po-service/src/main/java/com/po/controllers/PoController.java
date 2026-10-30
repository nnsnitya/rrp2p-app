package com.po.controllers;

import com.po.config.SapApiClient;
import com.po.dtos.PoRespDto;
import com.po.services.PoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/po")
@RequiredArgsConstructor
public class PoController {
    private final PoService poService;

    @GetMapping("/sync")
    public ResponseEntity<String> syncPos() {
        try {
            poService.syncPurchaseOrders();

            return ResponseEntity.ok(
                    "SAP sync completed. Records processed: "
            );
        } catch (Exception e) {
            return ResponseEntity.internalServerError()
                    .body("SAP sync failed");
        }
    }
}
