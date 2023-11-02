package com.emet.api.Locations;

import org.springframework.web.bind.annotation.PathVariable;

public interface LocationsDao {

    void save();

    Location getLocacionById(@PathVariable Long id);
}
