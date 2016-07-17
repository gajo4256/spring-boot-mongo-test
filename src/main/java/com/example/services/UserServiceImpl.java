package com.example.services;

import com.example.models.User;
import com.example.repositories.UserRepository;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final MongoTemplate mongoTemplate;

    public UserServiceImpl(final UserRepository userRepository, final MongoTemplate mongoTemplate) {
        this.userRepository = userRepository;
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findByFirstName(String firstName) {
        return userRepository.findByFirstName(firstName);
    }

    @Override
    public List<User> findAll() {
//        return userRepository.findAll();
        return mongoTemplate.findAll(User.class);
    }

    @Override
    public void deleteAll() {
        userRepository.deleteAll();
    }

}
