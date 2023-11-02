package com.emet.api.controller;

import com.emet.api.dao.Sensores.SensoresDaoImp;
import com.emet.api.dto.SensorData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping(value = "api/upload")
public class SensoresController {

    @Autowired
    private SensoresDaoImp sensoresDaoImp;

    @PostMapping
    public void saveData(@RequestBody SensorData sensorData) {
        sensoresDaoImp.saveDataSensor(sensorData);
    }
}
