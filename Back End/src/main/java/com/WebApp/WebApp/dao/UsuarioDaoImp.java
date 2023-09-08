package com.WebApp.WebApp.dao;

import com.WebApp.WebApp.models.Domicilio;
import com.WebApp.WebApp.models.Usuario;
import com.WebApp.WebApp.repositories.UsuarioRepository;
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
public class UsuarioDaoImp implements UsuarioDao {

    @PersistenceContext
    private EntityManager entityManager;
    @Autowired
    private UsuarioRepository usuarioRepo;


    @Override
    public List<Usuario> getLista() {
        String query = "FROM Usuario";  // OJO!!! Acá va la CLASE del modelo, NO la tabla
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void eliminar(int id) {
        Usuario user = entityManager.find(Usuario.class, id);
        entityManager.remove(user);
    }

    @Override
    public void registrar(Map<String, String> user) {
        // Preparamos el objeto
        Usuario newUser = new Usuario();
        //Buscamos domicilio
        Domicilio dom = entityManager.find(Domicilio.class, user.get("fk_domicilio"));

        newUser.setNombre(user.get("nombre"));
        newUser.setEmail(user.get("email"));
        newUser.setPassword(user.get("password"));
        newUser.setDomicilio(dom);

        entityManager.merge(newUser);
    }

    @Override
    public Usuario getUsuario(int id) {

            // Una variable Optional contempla que pueda ser nula
            // En este caso, la usamos porque quizás no exista usuario que coincida con el ID
            Optional<Usuario> user = usuarioRepo.findById(id);
            // Optional.get() devuelve el valor si existe, y devuelve una excepción si no existe
            return user.get();


    }

}

