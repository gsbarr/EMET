package com.emet.api.Locations;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/locacion")
public class LocationsController {

    private LocationsDaoImp locationsDao;

    @GetMapping("/{id}")
    public ResponseEntity<Location> getLocacion(@PathVariable Long id) {
        return new ResponseEntity<>(locationsDao.getLocacionById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> createLocation(@RequestBody LocationData data) {
        locationsDao.saveLocation(data);
        return new ResponseEntity<>("Creado exitosamente", HttpStatus.OK);
    }

}
