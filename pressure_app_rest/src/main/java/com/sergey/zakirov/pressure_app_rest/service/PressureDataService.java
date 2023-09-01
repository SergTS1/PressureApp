package com.sergey.zakirov.pressure_app_rest.service;

import com.sergey.zakirov.pressure_app_rest.dto.PressureDateGetDto;
import com.sergey.zakirov.pressure_app_rest.dto.PressureDatePostDto;

import java.util.List;

public interface PressureDataService {

    List<PressureDateGetDto> getAllDates();

    PressureDateGetDto getById(Long id);

    PressureDateGetDto createData(PressureDatePostDto pressureData);

    void deleteDataPressure(Long id);

    PressureDateGetDto updateDataPressure(PressureDatePostDto pressureData, Long id);

}
