package com.emet.api.controller;

import com.emet.api.models.Locacion;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "api/locacion")
public class LocacionesController {

    @GetMapping("/{id}")
    public Locacion getLocacion(@PathVariable Long id){
        return null;
    }

}
