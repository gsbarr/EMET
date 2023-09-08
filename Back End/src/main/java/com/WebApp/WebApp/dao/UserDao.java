package com.WebApp.WebApp.dao;

import com.WebApp.WebApp.models.UserEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

public interface UserDao {

    void createUser(Map<String, String> u);
    UserEntity getUserById(@PathVariable int id) ;
    List<UserEntity> getListOfUsers();
    void deleteUserById(int id);

}
