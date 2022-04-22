package com.example.aprender.phoenix.service;

import com.example.aprender.phoenix.model.User;
import com.example.aprender.phoenix.repository.UsersRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
@RequiredArgsConstructor
public class UserService {
    private final UsersRepository usersRepository;


    public List<User> getUsersById(Integer id){
        System.out.println("hit for :  " + id);
        return usersRepository.findAllById(id);
    }

}
