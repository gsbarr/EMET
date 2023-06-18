package com.WebApp.WebApp.dao;

import com.WebApp.WebApp.models.UserEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface UserDao {

    UserEntity createUser();
    List<UserEntity> getUser(@PathVariable int id);

}
