package com.WebApp.WebApp.dao;

import com.WebApp.WebApp.models.Pre_Atmosferica;
import com.WebApp.WebApp.repositories.Pre_AtmosfericaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Transactional
@Repository
public class Pre_AtmosfericaDaoImp implements Pre_AtmosfericaDao{
    @Autowired
    private Pre_AtmosfericaRepository preAtmosfericaRepo;
    @Override
    public void save(float presion_atmos, float altitud, Date fecha_hora) {
        Pre_Atmosferica pre_atmosEntity = new Pre_Atmosferica();

        pre_atmosEntity.setPresion(presion_atmos);
        pre_atmosEntity.setAltitud(altitud);
        pre_atmosEntity.setFechaHora(fecha_hora);

        preAtmosfericaRepo.save(pre_atmosEntity);

    }
}
