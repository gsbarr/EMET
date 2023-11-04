package com.emet.api.Locations;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface LocationsDao {

    Location getLocacionById(@PathVariable Long id);

    void saveLocation(@RequestBody LocationData data);
}
