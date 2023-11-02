package com.emet.api.statistics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "api/estadisticas")
public class StatisticsController {

    @Autowired
    private StatisticsDaoImp estadisticaDao;

    @PostMapping
    public List<Statistics> getList(@RequestBody Map<String, String> fecha_semana) {
        return estadisticaDao.getList(fecha_semana);
    }
}
