package com.WebApp.WebApp.controller;

import com.WebApp.WebApp.dao.TItularDaoImp;
import com.WebApp.WebApp.dao.UserDaoImp;
import com.WebApp.WebApp.models.Titular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "api/titular")
public class TitularController {

    @Autowired
    private TItularDaoImp titularDao;
    @GetMapping("/{id}")
    public Titular getTitular(@PathVariable Long id) {
        return titularDao.getTitularById(id);
    }
}
