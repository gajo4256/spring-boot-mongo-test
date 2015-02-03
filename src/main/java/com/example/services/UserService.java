package com.example.services;

import java.util.List;

import com.example.models.User;

public interface UserService {

    User save(User user);

    List<User> findByFirstName(String firstName);

    List<User> findAll();

}
