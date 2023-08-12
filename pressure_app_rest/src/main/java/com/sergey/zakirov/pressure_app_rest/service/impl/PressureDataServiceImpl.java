package com.sergey.zakirov.pressure_app_rest.service.impl;

import com.sergey.zakirov.pressure_app_rest.model.PressureData;
import com.sergey.zakirov.pressure_app_rest.repository.PressureDataRepository;
import com.sergey.zakirov.pressure_app_rest.service.PressureDataService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PressureDataServiceImpl implements PressureDataService {

    private PressureDataRepository pressureDataRepository;

    @Override
    public List<PressureData> getAllDates() {
        return pressureDataRepository.findAll();
    }

    @Override
    public PressureData getById(Long id) {
        PressureData pressureData = null;
        Optional<PressureData> optionalPressureData = pressureDataRepository.findById(id);
        if (optionalPressureData.isPresent()) {
            pressureData = optionalPressureData.get();
        }
        return pressureData;
    }

    @Override
    public PressureData createData(PressureData pressureData) {
        pressureDataRepository.save(pressureData);
        return pressureData;
    }

    @Override
    public void deleteDataPressure(Long id) {
        pressureDataRepository.deleteById(id);
    }
    @Override
    public PressureData updateDataPressure(PressureData pressureData, Long id) {
        PressureData newData;
        Optional<PressureData> data = pressureDataRepository.findById(id);
        if(data.isPresent()) {
            newData = data.get();
            newData.setMorningPressure(pressureData.getMorningPressure());
            newData.setEveningPressure(pressureData.getEveningPressure());
            newData.setComment(pressureData.getComment());
            newData.setLocalDateTime(pressureData.getLocalDateTime());
            newData.setPulse(pressureData.getPulse());
        } else {
            throw new NullPointerException("Дата не найдена");
        }
        return  pressureDataRepository.save(newData);

    }

}
