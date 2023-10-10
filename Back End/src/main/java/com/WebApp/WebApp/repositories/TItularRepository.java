package com.WebApp.WebApp.repositories;

import com.WebApp.WebApp.models.Titular;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TItularRepository extends JpaRepository<Titular, Long> {
}
