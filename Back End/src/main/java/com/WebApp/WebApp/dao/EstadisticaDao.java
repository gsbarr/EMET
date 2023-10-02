package com.WebApp.WebApp.dao;

import com.WebApp.WebApp.models.Estadistica;

import java.util.List;
import java.util.Map;

public interface EstadisticaDao {

    List<Estadistica> getList(Map<String, String> fecha_semana);
}
