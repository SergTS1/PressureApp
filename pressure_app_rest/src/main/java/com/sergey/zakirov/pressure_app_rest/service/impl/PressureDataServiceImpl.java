package com.sergey.zakirov.pressure_app_rest.service.impl;

import com.sergey.zakirov.pressure_app_rest.dto.PressureDateGetDto;
import com.sergey.zakirov.pressure_app_rest.dto.PressureDatePostDto;
import com.sergey.zakirov.pressure_app_rest.mapper.PressureDateMapper;
import com.sergey.zakirov.pressure_app_rest.model.PressureDate;
import com.sergey.zakirov.pressure_app_rest.repository.PressureDataRepository;
import com.sergey.zakirov.pressure_app_rest.service.PressureDataService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PressureDataServiceImpl implements PressureDataService {

    private PressureDataRepository pressureDataRepository;
    private PressureDateMapper mapper;

    public PressureDataServiceImpl(PressureDataRepository pressureDataRepository, PressureDateMapper mapper) {
        this.pressureDataRepository = pressureDataRepository;
        this.mapper = mapper;
    }

    @Override
    public List<PressureDateGetDto> getAllDates() {
        return mapper.toDtoAll(pressureDataRepository.findAll());
    }

    @Override
    public PressureDateGetDto getById(Long id) {
        return mapper.toDto(pressureDataRepository.findById(id).orElseThrow(RuntimeException::new));
    }

    @Override
    public PressureDateGetDto createData(PressureDatePostDto pressureData) {
        return mapper.toDto(pressureDataRepository.save(mapper.toEntity(pressureData)));
    }

    @Override
    public void deleteDataPressure(Long id) {
        pressureDataRepository.deleteById(id);
    }
    @Override
    public PressureDateGetDto updateDataPressure(PressureDatePostDto pressureData, Long id) {
        mapper.toEntity(pressureData);
        PressureDate newData;
        Optional<PressureDate> data = pressureDataRepository.findById(id);

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
        return mapper.toDto(pressureDataRepository.save(newData));
    }

}
