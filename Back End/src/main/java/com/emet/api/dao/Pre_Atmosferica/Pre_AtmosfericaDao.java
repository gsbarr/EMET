package com.emet.api.dao.Pre_Atmosferica;

import java.sql.Date;

public interface Pre_AtmosfericaDao {

    void save(float presion_atmos, float altitud, Date fecha_hora);
}