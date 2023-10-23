package com.emet.api.dto;

import com.emet.api.models.Titular;
import lombok.Getter;
import lombok.Setter;

public class LocacionData {

    @Getter @Setter
    private String nombre;
    @Getter @Setter
    private Float coordenadas;
    @Getter @Setter
    private String direccion;
    @Getter @Setter
    private Titular titular;
}
