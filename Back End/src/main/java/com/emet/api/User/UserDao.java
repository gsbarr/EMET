package com.emet.api.User;

import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface UserDao {

    void createUser(User_data user);

    User getUserById(@PathVariable Long id);

    List<User> getListOfUsers();

    void deleteUserById(Long id);

}
