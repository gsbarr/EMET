package com.emet.api.dao.Titular;

import com.emet.api.models.Titular;
import org.springframework.web.bind.annotation.PathVariable;

public interface TitularDao {

    Titular getTitularById(@PathVariable Long id);
}
