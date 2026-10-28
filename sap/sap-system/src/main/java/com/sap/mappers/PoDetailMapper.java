package com.sap.mappers;

import com.sap.dtos.PoDetailDto;
import com.sap.entities.PoDetail;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PoDetailMapper {
    @Mapping(source = "poId", target = "POID")
    @Mapping(source = "createdAt", target = "CREATED_AT")
    @Mapping(source = "description", target = "DESC")
    @Mapping(source = "state", target = "STT")
    PoDetailDto toDto(PoDetail poDetail);

    @InheritInverseConfiguration
    PoDetail toEntity(PoDetailDto poData);

    List<PoDetailDto> toDtoList(List<PoDetail> poDataList);
}
