package com.WebApp.WebApp.dao;

import com.WebApp.WebApp.models.Titular;
import com.WebApp.WebApp.repositories.TItularRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Transactional
@Repository
public class TItularDaoImp implements TitularDao{

    @Autowired
    private TItularRepository titularRepo;

    @Override
    public Titular getTitularById(Long id) {
        Optional<Titular> titular = titularRepo.findById(id);
        return titular.orElse(null);
    }
}
