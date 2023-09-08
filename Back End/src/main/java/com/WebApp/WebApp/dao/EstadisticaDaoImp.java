package com.WebApp.WebApp.dao;


import com.WebApp.WebApp.models.Estadistica;
import com.WebApp.WebApp.repositories.EstadisticaRepository;
import com.WebApp.WebApp.repositories.UsuarioRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
@Transactional
public class EstadisticaDaoImp {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private EstadisticaRepository estadisticaRepository;

    public Estadistica consultarTemperatura(Map<String, String> semana){
        Estadistica newStat = new Estadistica();
    }
}
