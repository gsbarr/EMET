package com.emet.api.controller;

import com.emet.api.dao.Locacion.LocacionDaoImp;
import com.emet.api.dto.LocacionData;
import com.emet.api.models.Locacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "api/locacion")
public class LocacionesController {

    @Autowired
    private LocacionDaoImp locacionDao;
    @GetMapping("/{id}")
    public Locacion getLocacion(@PathVariable Long id){
        return null;
    }

    @PostMapping
    public void createLocacion(@RequestBody LocacionData data){
        locacionDao.saveLocacion(data);
    }
}
