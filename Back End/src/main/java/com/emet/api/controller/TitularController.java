package com.emet.api.controller;

import com.emet.api.dao.Titular.TitularDaoImp;
import com.emet.api.models.Titular;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "api/titulares")
@Slf4j
public class TitularController {

    @Autowired
    private TitularDaoImp titularDao;
    @GetMapping("/{id}")
    public ResponseEntity<Titular> getTitular(@PathVariable Long id) {

        return (titularDao.getTitularById(id)) == null
                ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
                : new ResponseEntity<>(titularDao.getTitularById(id), HttpStatus.OK);
    }
}
