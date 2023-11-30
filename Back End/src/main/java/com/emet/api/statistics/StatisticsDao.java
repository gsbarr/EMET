package com.emet.api.statistics;

import com.emet.api.Locations.Location;

import java.util.List;
import java.util.Map;

public interface StatisticsDao {

    List<Statistics> getList(Map<String, String> fecha_semana);

    void promStatistics(String fecha_hoy, Location loc);
}
