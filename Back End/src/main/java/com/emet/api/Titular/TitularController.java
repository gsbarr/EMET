package com.emet.api.Titular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/titulares")
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
