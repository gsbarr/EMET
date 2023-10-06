package com.WebApp.WebApp.dao;

import java.sql.Date;

public interface Pre_AtmosfericaDao {

    void save(float presion_atmos, float altitud, Date fecha_hora);
}
