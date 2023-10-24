package com.emet.api.dto;

import lombok.Getter;
import lombok.Setter;

public class LocacionData {

    @Getter @Setter
    private String nombre;
    @Getter @Setter
    private String coordenadas;
    @Getter @Setter
    private String direccion;
    @Getter @Setter
    private Long titular;

    //public void setTitular_id(Long titular_id) {
    //    this.titular = titularRepo.findById(titular_id).orElse(null);
    //}
}
