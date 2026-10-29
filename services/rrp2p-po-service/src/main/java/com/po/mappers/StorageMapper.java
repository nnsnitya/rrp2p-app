package com.po.mappers;

import com.po.dtos.StorageDto;
import com.po.entities.Storage;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StorageMapper {
    @Mapping(source = "id", target = "ID")
    @Mapping(source = "createdAt", target = "CREATED_AT")
    @Mapping(source = "location", target = "LOC")
    @Mapping(source = "description", target = "DESC")
    @Mapping(source = "state", target = "STT")
    StorageDto toDto(Storage storage);

    @InheritInverseConfiguration
    Storage toEntity(StorageDto storageDto);

    List<StorageDto> toDtoList(List<Storage> storages);
}
