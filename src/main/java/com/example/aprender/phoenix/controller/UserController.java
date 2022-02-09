package com.example.aprender.phoenix.controller;

import com.example.aprender.phoenix.model.User;
import com.example.aprender.phoenix.service.UserService;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/user_details/{id}")
    public List<User> listAll(@NotNull @PathVariable Integer id) {
        return userService.getUsersById(id);
    }
}
