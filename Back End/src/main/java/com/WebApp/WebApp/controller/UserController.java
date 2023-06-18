package com.WebApp.WebApp.controller;

import com.WebApp.WebApp.dao.UserDaoImp;
import com.WebApp.WebApp.models.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired  //Inyección de dependencias
    private UserDaoImp user;
    @RequestMapping(value = "api/user/create")
    public UserEntity createUser() {
        UserEntity user = new UserEntity();
        user.setNombre("Carlos");
        user.setDni("2222");
        user.setPassword("1234");
        return user;
    }

    @RequestMapping(value = "api/user/{id}", method = RequestMethod.GET)
    public List<UserEntity> getUser(@PathVariable int id) {
        return user.getUser(id);
    }

}
