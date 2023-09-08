package com.WebApp.WebApp.controller;

import com.WebApp.WebApp.dao.EstadisticaDaoImp;
import com.WebApp.WebApp.models.Estadistica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class EstadisticasController {

    @Autowired
    private EstadisticaDaoImp estadistica;
    //@RequestMapping(value = "api/estadistica/temperatura", method = RequestMethod.GET)
    //public Estadistica consultarTemperatura(@RequestBody Map<String, String> semana){



    //}


}
