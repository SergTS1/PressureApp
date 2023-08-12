package com.sergey.zakirov.pressure_app_rest.controller;


import com.sergey.zakirov.pressure_app_rest.model.PressureData;
import com.sergey.zakirov.pressure_app_rest.service.PressureDataService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class PressureDataController {

    private PressureDataService pressureDataService;

    @GetMapping("/allPressuresDate")
    public List<PressureData> getAllPressureData() {
        List<PressureData> pressureDataList = pressureDataService.getAllDates();
        return pressureDataList;
    }

    @GetMapping("/findById/{id}")
    public PressureData findPressureDataById(@PathVariable Long id) {
        return pressureDataService.getById(id);
    }

    @PostMapping("/create")
    public PressureData createDataItem(@RequestBody PressureData pressureData) {
        pressureDataService.createData(pressureData);
        return pressureData;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDataItem(@PathVariable Long id) {
        pressureDataService.deleteDataPressure(id);
    }

    @PutMapping("/update/{id}")
    public PressureData updateItem(@RequestBody PressureData pressureData,
                                   @PathVariable("id") Long id) {
        pressureDataService.updateDataPressure(pressureData, id);
        return pressureData;
    }
}
