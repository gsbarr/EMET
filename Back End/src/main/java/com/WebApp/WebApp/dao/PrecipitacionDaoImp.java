package com.WebApp.WebApp.dao;

import com.WebApp.WebApp.models.Precipitacion;
import com.WebApp.WebApp.repositories.PrecipitacionRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Transactional
@Repository
public class PrecipitacionDaoImp implements PrecipitacionDao{
    @Autowired
    private PrecipitacionRepository precipitacionRepo;
    @Override
    public void save(float agua_llovida, Date fecha_hora) {
        Precipitacion preciEntity = new Precipitacion();

        preciEntity.setValorPrecipiMm(agua_llovida);
        preciEntity.setFechaHora(fecha_hora);
        preciEntity.setLocacion(null);

        precipitacionRepo.save(preciEntity);
    }
}