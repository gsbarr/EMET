package com.emet.api.dao.Estadistica;

import com.emet.api.models.Estadistica;

import java.util.List;
import java.util.Map;

public interface EstadisticaDao {

    List<Estadistica> getList(Map<String, String> fecha_semana);
}
