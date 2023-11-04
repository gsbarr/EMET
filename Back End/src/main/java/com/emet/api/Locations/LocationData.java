package com.emet.api.Locations;

import com.emet.api.Titular.Titular;

import lombok.Getter;
import lombok.Setter;

public class LocationData {

    @Getter
    @Setter
    private String nombre;
    @Getter
    @Setter
    private String coordenadas;
    @Getter
    @Setter
    private String direccion;
    @Getter
    @Setter
    private Titular titular;
}
