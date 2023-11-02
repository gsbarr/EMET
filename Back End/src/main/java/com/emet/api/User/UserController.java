package com.emet.api.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/usuarios")
public class UserController {

    @Autowired // Inyección de dependencias
    private UserDaoImp userDao;

    // @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    @GetMapping
    public List<User> getUserList() {
        return userDao.getListOfUsers();
    }

    // @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userDao.getUserById(id);
    }

    // @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody UsuarioData nuevoU) {
        // Creamos usuario
        userDao.createUser(nuevoU);
        return ResponseEntity.ok("Se ha creado el usuario correctamente");
    }

    // @RequestMapping(value = "api/usuarios/delete/{id}", method =
    // RequestMethod.DELETE)
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        userDao.deleteUserById(id);
    }
}
