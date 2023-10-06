package com.WebApp.WebApp.dao;

import com.WebApp.WebApp.models.Temp_Hum;
import com.WebApp.WebApp.repositories.Temp_HumRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Transactional
@Repository
public class Temp_HumDaoImp implements Temp_HumDao{

    @Autowired
    private Temp_HumRepository temp_humRepo;
    @Override
    public void save(float temp, float hum, Date fecha_hora) {
        Temp_Hum temp_humEntity = new Temp_Hum();

        temp_humEntity.setValorTemp(temp);
        temp_humEntity.setValorHum(hum);
        temp_humEntity.setFechaHora(fecha_hora);

        temp_humRepo.save(temp_humEntity);
    }
}
