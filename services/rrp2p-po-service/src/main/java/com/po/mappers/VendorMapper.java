package com.po.mappers;

import com.po.dtos.VendorDto;
import com.po.entities.Vendor;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VendorMapper {
    @Mapping(source = "id", target = "ID")
    @Mapping(source = "poItem", target = "PO_ITM")
    @Mapping(source = "addedAt", target = "ADDED_AT")
    @Mapping(source = "location", target = "LOC")
    @Mapping(source = "description", target = "DESC")
    @Mapping(source = "state", target = "STT")
    VendorDto toDto(Vendor vendor);

    @InheritInverseConfiguration
    Vendor toEntity(VendorDto vendorDto);

    List<VendorDto> toDtoList(List<Vendor> vendors);
}
