package com.po.mappers;

import com.po.dtos.PoItemDto;
import com.po.entities.PoItem;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PoItemMapper {
    @Mapping(source = "itemId", target = "POITM")
    @Mapping(source = "poId", target = "PO_ID")
    @Mapping(source = "createdAt", target = "CREATED_AT")
    @Mapping(source = "description", target = "DESC")
    @Mapping(source = "state", target = "STT")
    @Mapping(source = "materialId", target = "MAT_ID")
    @Mapping(source = "plantId", target = "PLANT_ID")
    @Mapping(source = "receiptId", target = "RECPT_ID")
    @Mapping(source = "scheduleId", target = "SCHEDULE_ID")
    PoItemDto toDto(PoItem poItem);

    @InheritInverseConfiguration
    PoItem toEntity(PoItemDto itmData);

    List<PoItem> toEntityList(List<PoItemDto> itmDtos);
}
