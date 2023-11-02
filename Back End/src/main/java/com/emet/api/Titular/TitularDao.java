package com.emet.api.Titular;

import org.springframework.web.bind.annotation.PathVariable;

public interface TitularDao {

    Titular getTitularById(@PathVariable Long id);
}
