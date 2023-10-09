package com.WebApp.WebApp.controller;

import com.WebApp.WebApp.dao.UploadDataDaoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "api/upload")
public class UploadDataController {

    @Autowired
    private UploadDataDaoImp uploadDataDao;

    @PostMapping
    public void saveData(@RequestBody SensorData sensorData){
        uploadDataDao.saveDataSensor(sensorData);
    }
}
