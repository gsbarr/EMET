package com.emet.api.User;

import org.springframework.beans.factory.annotation.Autowired;
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
    // @PostMapping
    // public ResponseEntity<String> createUser(@RequestBody User_data nuevoU) {
    // // Creamos usuario
    // try {
    // userDao.createUser(nuevoU);
    // } catch (DataIntegrityViolationException e) {
    // log.info(e.getMessage());
    // return new ResponseEntity<>("The username already exists",
    // HttpStatus.BAD_REQUEST);
    // }
    // return new ResponseEntity<>("User created successfully", HttpStatus.CREATED);
    // }

    // @RequestMapping(value = "api/usuarios/delete/{id}", method =
    // RequestMethod.DELETE)
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        userDao.deleteUserById(id);
    }

}
