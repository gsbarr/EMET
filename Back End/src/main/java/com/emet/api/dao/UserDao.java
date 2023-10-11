package com.emet.api.dao;

import com.emet.api.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

public interface UserDao {

    void createUser(Map<String, String> user);
    Usuario getUserById(@PathVariable Long id);
    List<Usuario> getListOfUsers();
    void deleteUserById(Long id);

}
