package com.emet.api.dao.Locacion;

import com.emet.api.dto.LocacionData;
import com.emet.api.models.Locacion;
import org.springframework.web.bind.annotation.PathVariable;

public interface LocacionDao {

    void saveLocacion(LocacionData data);

    Locacion getLocacionById(@PathVariable Long id);
}
