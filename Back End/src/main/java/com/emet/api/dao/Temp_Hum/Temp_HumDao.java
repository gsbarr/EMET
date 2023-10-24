package com.emet.api.dao.Temp_Hum;

import java.sql.Date;

public interface Temp_HumDao {

    void save(float temp, float hum, Date fecha_hora);
}
