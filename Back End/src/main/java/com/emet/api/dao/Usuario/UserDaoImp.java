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

        newUser.setUsuario(userData.getUsuario());
        newUser.setEmail(userData.getEmail());
        newUser.setPassword(userData.getPassword());

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

