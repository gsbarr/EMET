package com.WebApp.WebApp.dao;

import com.WebApp.WebApp.models.Domicilio;
import com.WebApp.WebApp.models.Usuario;
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
    public List<Usuario> getListOfUsers() {
        //String query = "FROM Usuario";  // OJO!!! Acá va la CLASE del modelo, NO la tabla
        return userRepo.findAll();
    }

    @Override
    public void deleteUserById(int id) {
        //Optional<UserEntity> user = userRepo.findById(id);
        userRepo.deleteById(id);
    }

    @Override
    public void createUser(Map<String, String> userData) {
        // Preparamos el objeto
        Usuario newUser = new Usuario();

        //Buscamos domicilio
        Domicilio dom = entityManager.find(Domicilio.class, userData.get("fk_domicilio"));

        newUser.setNombre(userData.get("name"));
        newUser.setEmail(userData.get("email"));
        newUser.setPassword(userData.get("password"));
        newUser.setDomicilio(dom);

        //entityManager.merge(newUser);
        userRepo.save(newUser);
    }

    @Override
    public Usuario getUserById(int id) {

            // Una variable Optional contempla que pueda ser nula
            // En este caso, la usamos porque quizás no exista usuario que coincida con el ID
            Optional<Usuario> user = userRepo.findById(id);
            // Optional.get() devuelve el valor si existe, y devuelve una excepción si no existe
            // return (user.isPresent()) ? user.get() : null;
            return user.orElse(null);


    }

}

