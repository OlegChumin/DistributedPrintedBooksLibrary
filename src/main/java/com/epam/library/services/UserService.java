package com.epam.library.services;

import com.epam.library.models.entities.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Long id);
    User save(User user);
    void deleteById(Long id);

    User addUser(User user);

    User getUserById(Long id);

    User updateUser(Long id, User user);

    void deleteUser(Long id);

    List<User> getAllUsers();
}
