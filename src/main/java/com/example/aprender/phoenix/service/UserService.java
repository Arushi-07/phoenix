package com.example.aprender.phoenix.service;

import com.example.aprender.phoenix.model.User;
import com.example.aprender.phoenix.repository.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class UserService {
    private final UsersRepository usersRepository;

    public List<User> getUsersById(Integer id){
        return usersRepository.findAllById(id);
    }

}
