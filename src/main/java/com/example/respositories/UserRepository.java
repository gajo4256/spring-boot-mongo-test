package com.example.respositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>, UserRepositoryCustom {

    User findById(String id);

    List<User> findByFirstName(String name);

    List<User> findByLastName(String lastName);


}
