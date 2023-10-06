package com.WebApp.WebApp.controller;

import com.WebApp.WebApp.dao.Pre_AtmosfericaDaoImp;
import com.WebApp.WebApp.dao.PrecipitacionDaoImp;
import com.WebApp.WebApp.dao.Temp_HumDaoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "api/upload")
public class UploadDataController {
    @Autowired  //Inyección de dependencias
    private Temp_HumDaoImp tempHumDao;
    @Autowired  //Inyección de dependencias
    private Pre_AtmosfericaDaoImp preAtmosfericaDao;
    @Autowired  //Inyección de dependencias
    private PrecipitacionDaoImp precipitacionDao;

    @PostMapping
    public void saveData(@RequestBody SensorData sensorData){
        float temp = sensorData.getTemperature();
        float hum = sensorData.getHumidity();
        float presion = sensorData.getPresion();
        float altitud = sensorData.getAltitud();
        float precipitacion = sensorData.getPrecipitacion();
        Date fecha_hora = sensorData.getDate();

        tempHumDao.save(temp, hum, fecha_hora);
        preAtmosfericaDao.save(presion, altitud, fecha_hora);
        precipitacionDao.save(precipitacion, fecha_hora);
    }

}
