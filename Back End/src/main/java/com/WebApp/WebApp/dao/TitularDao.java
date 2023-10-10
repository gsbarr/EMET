package com.WebApp.WebApp.dao;

import com.WebApp.WebApp.models.Titular;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

public interface TitularDao {

    Titular getTitularById(@PathVariable Long id);
}
