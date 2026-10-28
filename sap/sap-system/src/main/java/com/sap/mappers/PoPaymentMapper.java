package com.sap.mappers;

import com.sap.dtos.PoPaymentDto;
import com.sap.entities.PoPayment;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PoPaymentMapper {
    @Mapping(source = "id", target = "ID")
    @Mapping(source = "poId", target = "PID")
    @Mapping(source = "poItem", target = "PITM")
    @Mapping(source = "paidOn", target = "PAIDON")
    @Mapping(source = "description", target = "DESC")
    @Mapping(source = "state", target = "STATUS")
    PoPaymentDto toDto(PoPayment poPayment);

    @InheritInverseConfiguration
    PoPayment toEntity(PoPaymentDto payDto);

    List<PoPaymentDto> toDtoList(List<PoPayment> poPayments);
}
