package com.WebApp.WebApp.controller;

import com.WebApp.WebApp.dao.EstadisticaDaoImp;
import com.WebApp.WebApp.models.Estadistica;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "api/estadisticas")
@Slf4j
public class EstadisticaController {

    @Autowired
    private EstadisticaDaoImp estadisticaDao;

    @PostMapping
    public List<Estadistica> getList(@RequestBody Map<String, String> fecha_semana){
        log.info("Body : " + fecha_semana);
        return estadisticaDao.getList(fecha_semana);
    }
}
