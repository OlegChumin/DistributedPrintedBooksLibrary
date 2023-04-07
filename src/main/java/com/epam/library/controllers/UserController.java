package com.epam.library.controllers;

import com.epam.library.models.entities.User;
import com.epam.library.models.entities.dto.UserDTO;
import com.epam.library.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PutMapping("/{id}")
    public UserDTO updateUser(@PathVariable Long id, @RequestBody UserDTO userDTO) {
        User user = userService.getUserById(id);
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        User updatedUser = userService.updateUser(id, user);
        return new UserDTO(updatedUser.getId(), updatedUser.getFirstName(), updatedUser.getLastName(), updatedUser.getEmail(), updatedUser.getPassword());
    }

    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable Long id) {
        User user = userService.getUserById(id);
        return new UserDTO(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword());
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

}
