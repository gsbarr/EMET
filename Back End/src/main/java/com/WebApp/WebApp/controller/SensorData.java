package com.WebApp.WebApp.controller;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

public class SensorData {

    @Getter @Setter
    private float temperature;
    @Getter @Setter
    private float humidity;
    @Getter @Setter
    private float precipitacion;
    @Getter @Setter
    private float presion;
    @Getter @Setter
    private float altitud;
    @Getter @Setter
    private float waterRained;
    @Getter @Setter
    private Date date;
}
