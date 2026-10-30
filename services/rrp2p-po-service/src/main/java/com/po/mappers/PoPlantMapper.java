package com.po.mappers;

import com.po.dtos.PoPlantDto;
import com.po.entities.PoPlant;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PoPlantMapper {
    @Mapping(source = "id", target = "PLID")
    @Mapping(source = "name", target = "NAME")
    @Mapping(source = "itemId", target = "ITM_ID")
    @Mapping(source = "itemName", target = "ITM_NAME")
    @Mapping(source = "createdAt", target = "CREATED_AT")
    @Mapping(source = "location", target = "LOC")
    @Mapping(source = "description", target = "DESC")
    @Mapping(source = "state", target = "STT")
    PoPlantDto toDto(PoPlant poPlant);

    @InheritInverseConfiguration
    PoPlant toEntity(PoPlantDto plantDto);

    List<PoPlant> toEntityList(List<PoPlantDto> plantDtos);
}
