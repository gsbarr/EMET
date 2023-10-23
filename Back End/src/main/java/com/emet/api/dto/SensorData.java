package com.emet.api.dto;

import lombok.Getter;
import lombok.Setter;
public class SensorData {

    @Getter @Setter
    private float temperature;
    @Getter @Setter
    private float humidity;
    @Getter @Setter
    private float presion;
    @Getter @Setter
    private float altitud;
    @Getter @Setter
    private float waterRained;
    @Getter @Setter
    private String date;
}
