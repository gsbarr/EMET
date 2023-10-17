package com.emet.api.dao;

import java.sql.Date;

public interface Temp_HumDao {

    void save(float temp, float hum, Date fecha_hora);
}
