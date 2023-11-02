package com.emet.api.statistics;

import java.util.List;
import java.util.Map;

public interface StatisticsDao {

    List<Statistics> getList(Map<String, String> fecha_semana);
}
