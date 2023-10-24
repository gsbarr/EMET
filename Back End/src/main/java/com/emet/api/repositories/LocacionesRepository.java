package com.emet.api.repositories;

import com.emet.api.models.Locacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocacionesRepository extends JpaRepository<Locacion, Long> {
}
