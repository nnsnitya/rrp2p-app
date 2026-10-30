package com.po.mappers;

import com.po.dtos.PoScheduleDto;
import com.po.entities.PoSchedule;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PoScheduleMapper {
    @Mapping(source = "id", target = "ID")
    @Mapping(source = "poItem", target = "PO_ITM")
    @Mapping(source = "poId", target = "PO_ID")
    @Mapping(source = "createdAt", target = "CREATED_AT")
    @Mapping(source = "scheduledOn", target = "SCHEDULED_ON")
    @Mapping(source = "description", target = "DESC")
    @Mapping(source = "state", target = "STT")
    PoScheduleDto toDto(PoSchedule poSchedule);

    @InheritInverseConfiguration
    PoSchedule toEntity(PoScheduleDto scheduleDto);

    List<PoSchedule> toEntityList(List<PoScheduleDto> scheduleDtos);
}
