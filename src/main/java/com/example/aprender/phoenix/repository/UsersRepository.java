package com.example.aprender.phoenix.repository;

import com.example.aprender.phoenix.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersRepository extends JpaRepository<User, Integer> {
    List<User> findAllById(Integer id);
}
