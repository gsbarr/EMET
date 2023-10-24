package com.emet.api.dao.Precicpitacion;

import java.sql.Date;

public interface PrecipitacionDao {

    void save(float water_rained, Date fecha_hora);
}
