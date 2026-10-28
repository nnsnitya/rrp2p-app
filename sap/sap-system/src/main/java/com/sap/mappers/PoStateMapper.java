package com.sap.mappers;

import com.sap.dtos.PoStateDto;
import com.sap.entities.PoState;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PoStateMapper {
    @Mapping(source = "id", target = "ID")
    @Mapping(source = "poId", target = "PO_ID")
    @Mapping(source = "state", target = "STATE")
    @Mapping(source = "updatedOn", target = "UPDATON")
    PoStateDto toDto(PoState poState);

    @InheritInverseConfiguration
    PoState toEntity(PoStateDto poStateDto);

    List<PoStateDto> toDtoList(List<PoState> poStates);
}
