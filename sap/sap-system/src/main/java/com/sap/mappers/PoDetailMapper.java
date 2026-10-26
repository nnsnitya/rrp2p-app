package com.sap.mappers;

import com.sap.dtos.PO_DATA;
import com.sap.entities.PoDetail;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PoDetailMapper {
    PO_DATA toDto(PoDetail poDetail);

    PoDetail toEntity(PO_DATA poData);

    List<PO_DATA> toDtoList(List<PoDetail> poDataList);
}
