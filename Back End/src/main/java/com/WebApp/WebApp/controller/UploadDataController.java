package com.WebApp.WebApp.controller;

import com.WebApp.WebApp.dao.Pre_AtmosfericaDaoImp;
import com.WebApp.WebApp.dao.PrecipitacionDaoImp;
import com.WebApp.WebApp.dao.Temp_HumDaoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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
        float precipitacion = sensorData.getWaterRained();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        try {
            java.util.Date utilDate = sdf.parse(sensorData.getDate());
            Date fecha_hora = new Date(utilDate.getTime());
            tempHumDao.save(temp, hum, fecha_hora);
            preAtmosfericaDao.save(presion, altitud, fecha_hora);
            precipitacionDao.save(precipitacion, fecha_hora);
        } catch (ParseException e) {
            // Manejar la excepción aquí (puede imprimir un mensaje de error o tomar otra acción)
            e.printStackTrace();
        }

    }

}
