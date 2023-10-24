package com.emet.api.dao.Sensores;

import com.emet.api.dto.SensorData;
import com.emet.api.dao.Pre_Atmosferica.Pre_AtmosfericaDaoImp;
import com.emet.api.dao.Precicpitacion.PrecipitacionDaoImp;
import com.emet.api.dao.Temp_Hum.Temp_HumDaoImp;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@Transactional
@Repository
public class SensoresDaoImp implements SensoresDao {

    @Autowired  //Inyección de dependencias
    private Temp_HumDaoImp tempHumDao;
    @Autowired  //Inyección de dependencias
    private Pre_AtmosfericaDaoImp preAtmosfericaDao;
    @Autowired  //Inyección de dependencias
    private PrecipitacionDaoImp precipitacionDao;

    @Override
    public void saveDataSensor(SensorData sensorData) {
        float temp = sensorData.getTemperature();
        float hum = sensorData.getHumidity();
        float presion = sensorData.getPresion();
        float altitud = sensorData.getAltitud();
        float precipitacion = sensorData.getWaterRained();
        Date date = parseDate(sensorData.getDate());

        tempHumDao.save(temp, hum, date);
        preAtmosfericaDao.save(presion, altitud, date);
        precipitacionDao.save(precipitacion, date);
    }

    private Date parseDate(String dateStr){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        try {
            java.util.Date utilDate = sdf.parse(dateStr);
            return new Date(utilDate.getTime());
        } catch (ParseException e) {
            // Manejar la excepción aquí (puede imprimir un mensaje de error o tomar otra acción)
            e.printStackTrace();
        }
        return null;
    }
}
