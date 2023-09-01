package com.sergey.zakirov.pressure_app_rest.controller;


import com.sergey.zakirov.pressure_app_rest.dto.PressureDateGetDto;
import com.sergey.zakirov.pressure_app_rest.dto.PressureDatePostDto;
import com.sergey.zakirov.pressure_app_rest.service.PressureDataService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
//@Api("Контроллер с круд операциями")
public class PressureDataController {

    private PressureDataService pressureDataService;

    public PressureDataController(PressureDataService pressureDataService) {
        this.pressureDataService = pressureDataService;
    }

    @GetMapping("/allPressuresDate")
    @Operation(summary = "Получение всех данных")
    public List<PressureDateGetDto> getAllPressureData() {
        return pressureDataService.getAllDates();
    }

    @GetMapping("/findById/{id}")
    @Operation(summary = "Поиск по Id")
    public PressureDateGetDto findPressureDataById(@PathVariable Long id) {
        return pressureDataService.getById(id);
    }

    @PostMapping("/create")
    @Operation(summary = "Создание данных")
    public PressureDateGetDto createDataItem(@RequestBody PressureDatePostDto pressureData) {
        return pressureDataService.createData(pressureData);
    }

    @DeleteMapping("/delete/{id}")
    @Operation(summary = "Удление данных по Id")
    public void deleteDataItem(@PathVariable Long id) {
        pressureDataService.deleteDataPressure(id);
    }

    @PutMapping("/update/{id}")
    @Operation(summary = "Обновление имеющихся данных")
    public PressureDateGetDto updateItem(@RequestBody PressureDatePostDto pressureData,
                                   @PathVariable("id") Long id) {
        return pressureDataService.updateDataPressure(pressureData, id);

    }
}
