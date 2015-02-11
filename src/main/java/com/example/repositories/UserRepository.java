package com.example.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.models.User;

public interface UserRepository extends MongoRepository<User, String>, UserRepositoryCustom {

    User findById(String id);

    List<User> findByFirstName(String name);

    List<User> findByLastName(String lastName);


}
