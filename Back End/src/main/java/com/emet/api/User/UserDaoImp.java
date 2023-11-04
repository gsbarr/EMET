package com.emet.api.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

// UN DAO (Data Object) es la clase que realiza consultas al modelo y realiza operaciones sobre los datos

@Transactional
@Repository
public class UserDaoImp implements UserDao {

    @Autowired
    private UserRepository userRepo;

    @Override
    public List<User> getListOfUsers() {
        // String query = "FROM Usuario"; // OJO!!! Acá va la CLASE del modelo, NO la
        // tabla
        return userRepo.findAll();
    }

    @Override
    public void deleteUserById(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public void createUser(User_data userData) {
        // Preparamos el objeto
        User newUser = new User();

        newUser.setUsername(userData.getUsername());
        newUser.setEmail(userData.getEmail());
        newUser.setPassword(userData.getPassword());

        // entityManager.merge(newUser);
        userRepo.save(newUser);
    }

    @Override
    public User getUserById(Long id) {

        // Una variable Optional contempla que pueda ser nula
        // En este caso, la usamos porque quizás no exista usuario que coincida con el
        // ID
        return userRepo.findById(id).orElse(null);
        // Optional.get() devuelve el valor si existe, y devuelve una excepción si no
        // existe
        // return (user.isPresent()) ? user.get() : null;
    }

}
