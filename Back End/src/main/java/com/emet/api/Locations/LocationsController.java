package com.emet.api.Locations;

import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping(value = "api/locacion")
public class LocationsController {

    @GetMapping("/{id}")
    public Location getLocacion(@PathVariable Long id) {
        return null;
    }

}
