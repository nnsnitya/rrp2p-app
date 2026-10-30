package com.sap.controllers;

import com.sap.dtos.PoRespDto;
import com.sap.services.PoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/po")
@RequiredArgsConstructor
public class PoController {
    private final PoService poService;

    @GetMapping("/po")
    public ResponseEntity<?> getLast30DaysRecords() {
        System.out.println("sap records requested...");
        PoRespDto last30DaysRecords = poService.getLast30DaysRecords();
        return new ResponseEntity<>(last30DaysRecords, HttpStatus.OK);
    }
}
