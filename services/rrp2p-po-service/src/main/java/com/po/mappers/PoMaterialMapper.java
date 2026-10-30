package com.po.mappers;

import com.po.dtos.PoMaterialDto;
import com.po.entities.PoMaterial;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PoMaterialMapper {
    @Mapping(source = "id", target = "ID")
    @Mapping(source = "poItem", target = "PO_ITM")
    @Mapping(source = "createdAt", target = "CREATED_AT")
    @Mapping(source = "location", target = "LOC")
    @Mapping(source = "description", target = "DESC")
    @Mapping(source = "state", target = "STT")
    PoMaterialDto toDto(PoMaterial poMaterial);

    @InheritInverseConfiguration
    PoMaterial toEntity(PoMaterialDto matDto);

    List<PoMaterial> toEntityList(List<PoMaterialDto> materialDtos);
}
