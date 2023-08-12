package com.sergey.zakirov.pressure_app_rest.service;

import com.sergey.zakirov.pressure_app_rest.model.PressureData;
import org.springframework.http.HttpStatus;

import java.util.List;

public interface PressureDataService {

    List<PressureData> getAllDates();

    PressureData getById(Long id);

    PressureData createData(PressureData pressureData);

    void deleteDataPressure(Long id);

    PressureData updateDataPressure(PressureData pressureData, Long id);

}
