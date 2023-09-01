package com.sergey.zakirov.pressure_app_rest.mapper;


import com.sergey.zakirov.pressure_app_rest.dto.PressureDateGetDto;
import com.sergey.zakirov.pressure_app_rest.dto.PressureDatePostDto;
import com.sergey.zakirov.pressure_app_rest.model.PressureDate;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PressureDateMapper {

    PressureDateGetDto toDto(PressureDate entity);

    PressureDate toEntity(PressureDatePostDto dto);

    List<PressureDateGetDto> toDtoAll(List<PressureDate> entities);
}
