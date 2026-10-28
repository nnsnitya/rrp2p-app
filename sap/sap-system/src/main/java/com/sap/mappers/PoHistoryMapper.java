package com.sap.mappers;

import com.sap.dtos.PoHistoryDto;
import com.sap.entities.PoHistory;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PoHistoryMapper {
    @Mapping(source = "id", target = "ID")
    @Mapping(source = "poId", target = "PO_ITM")
    @Mapping(source = "poItem", target = "PO_ID")
    @Mapping(source = "createdAt", target = "CREATED_AT")
    @Mapping(source = "description", target = "DESC")
    @Mapping(source = "state", target = "STT")
    PoHistoryDto toDto(PoHistory poHistory);

    @InheritInverseConfiguration
    PoHistory toEntity(PoHistoryDto historyData);

    List<PoHistoryDto> toDtoList(List<PoHistory> poHistoryList);
}
