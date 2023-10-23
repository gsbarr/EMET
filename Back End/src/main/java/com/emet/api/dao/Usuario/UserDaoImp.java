package com.emet.api.dao.Usuario;

import com.emet.api.dto.UsuarioData;
import com.emet.api.models.Usuario;
import com.emet.api.repositories.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.Optional;

// UN DAO (Data Object) es la clase que realiza consultas al modelo y realiza operaciones sobre los datos

@Transactional
@Repository
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
    public void deleteUserById(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public void createUser(UsuarioData userData) {
        // Preparamos el objeto
        Usuario newUser = new Usuario();

<<<<<<< Updated upstream:Back End/src/main/java/com/emet/api/dao/UserDaoImp.java
        //Buscamos domicilio
        //Cuando intenta buscar el domicilio explota el servidor
        //¿El domicilio no deberia venir en el JSON?
        //Domicilio dom = entityManager.find(Domicilio.class, userData.get("fk_domicilio"));

        newUser.setUsuario(userData.get("name"));
        newUser.setEmail(userData.get("email"));
        newUser.setPassword(userData.get("password"));
=======
        newUser.setNombre(userData.getNombre());
        newUser.setApellido(userData.getApellido());
        newUser.setEmail(userData.getEmail());
        newUser.setPassword(userData.getPassword());
>>>>>>> Stashed changes:Back End/src/main/java/com/emet/api/dao/Usuario/UserDaoImp.java

        //entityManager.merge(newUser);
        userRepo.save(newUser);
    }

    @Override
    public Usuario getUserById(Long id) {

            // Una variable Optional contempla que pueda ser nula
            // En este caso, la usamos porque quizás no exista usuario que coincida con el ID
            Optional<Usuario> user = userRepo.findById(id);
            // Optional.get() devuelve el valor si existe, y devuelve una excepción si no existe
            // return (user.isPresent()) ? user.get() : null;
            return user.orElse(null);
    }

}

