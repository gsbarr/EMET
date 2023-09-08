package com.WebApp.WebApp.controller;

import com.WebApp.WebApp.dao.UserDaoImp;
import com.WebApp.WebApp.models.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired  //Inyección de dependencias
    private UserDaoImp userDao;

    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List<UserEntity> getUserList() {
        return userDao.getListOfUsers();
    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)
    public UserEntity getUser(@PathVariable int id) {
        return userDao.getUserById(id);
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public ResponseEntity<String> createUser(@RequestBody Map<String, String> nuevoU) {
        //Creamos usuario
        userDao.createUser(nuevoU);
        return ResponseEntity.ok("Se ha creado el usuario correctamente");
    }

    @RequestMapping(value = "api/usuarios/del/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable int id) {
        userDao.deleteUserById(id);
    }

}
