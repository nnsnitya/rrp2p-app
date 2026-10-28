package com.sap.mappers;

import com.sap.dtos.PoReceiptDto;
import com.sap.entities.PoReceipt;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PoReceiptMapper {
    @Mapping(source = "id", target = "ID")
    @Mapping(source = "poId", target = "PO_ITM")
    @Mapping(source = "poItem", target = "PO_ID")
    @Mapping(source = "createdAt", target = "CREATED_AT")
    @Mapping(source = "description", target = "DESC")
    @Mapping(source = "state", target = "STT")
    PoReceiptDto toDto(PoReceipt poReceipt);

    @InheritInverseConfiguration
    PoReceipt toEntity(PoReceiptDto receiptDto);

    List<PoReceiptDto> toDtoList(List<PoReceipt> poReceipts);
}
