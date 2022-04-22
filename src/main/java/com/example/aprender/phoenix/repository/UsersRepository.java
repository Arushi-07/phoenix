package com.example.aprender.phoenix.repository;

import com.example.aprender.phoenix.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {
    List<User> findAllById(Integer id);

    List<User> findByContactNumberAndId(String cno, String id);
}
