package com.WebApp.WebApp.dao;

import com.WebApp.WebApp.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface UserDao {

    void createUser(Map<String, String> u);
    Usuario getUserById(@PathVariable int id);
    List<Usuario> getListOfUsers();
    void deleteUserById(int id);

}
