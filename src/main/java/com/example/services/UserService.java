package com.example.services;

import com.example.models.User;

import java.util.List;

public interface UserService {

    User save(User user);

    List<User> findByFirstName(String firstName);

    List<User> findAll();

    void deleteAll();

}
