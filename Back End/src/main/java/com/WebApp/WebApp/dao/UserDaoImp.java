package com.WebApp.WebApp.dao;

import com.WebApp.WebApp.models.DomicilioEntity;
import com.WebApp.WebApp.models.UserEntity;
import com.WebApp.WebApp.repositories.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.Optional;

// UN DAO (Data Object) es la clase que realiza consultas al modelo y realiza operaciones sobre los datos

@Repository
@Transactional
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;
    @Autowired
    private UserRepository userRepo;

    @Override
    public List<UserEntity> getListOfUsers() {
        String query = "FROM Usuario";  // OJO!!! Acá va la CLASE del modelo, NO la tabla
        List<UserEntity> users = userRepo.findAll();
        return users;
    }

    @Override
    public void deleteUserById(int id) {
        //Optional<UserEntity> user = userRepo.findById(id);
        userRepo.deleteById(id);
    }

    @Override
    public void createUser(Map<String, String> userData) {
        // Preparamos el objeto
        UserEntity newUser = new UserEntity();

        //Buscamos domicilio
        DomicilioEntity dom = entityManager.find(DomicilioEntity.class, userData.get("fk_domicilio"));

        newUser.setNombre(userData.get("name"));
        newUser.setEmail(userData.get("email"));
        newUser.setPassword(userData.get("password"));
        newUser.setDomicilio(dom);

        entityManager.merge(newUser);
    }

    @Override
    public UserEntity getUserById(int id) {

            // Una variable Optional contempla que pueda ser nula
            // En este caso, la usamos porque quizás no exista usuario que coincida con el ID
            Optional<UserEntity> user = userRepo.findById(id);
            // Optional.get() devuelve el valor si existe, y devuelve una excepción si no existe
            return user.get();


    }

}

