package com.emet.api.dao.Locacion;

import com.emet.api.models.Locacion;
import org.springframework.web.bind.annotation.PathVariable;

public interface LocacionDao {

    void save();

    Locacion getLocacionById(@PathVariable Long id);
}
