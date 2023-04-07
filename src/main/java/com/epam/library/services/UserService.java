package com.epam.library.services;

import com.epam.library.models.entities.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Long id);
    User save(User user);
    void deleteById(Long id);
}
