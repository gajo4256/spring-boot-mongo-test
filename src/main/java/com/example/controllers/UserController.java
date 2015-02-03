package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.User;
import com.example.services.UserService;

@RequestMapping(value = "/users")
@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(final UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public User getTestUser() {
        return new User("123", "John", "Doe");
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public void saveUser(@RequestBody User user) {
        userService.save(user);
    }

    @RequestMapping("/{firstName}")
    public List<User> getAllByName(@PathVariable String firstName) {
        return userService.findByFirstName(firstName);
    }

    @RequestMapping("/all")
    public List<User> getAll() {
        return userService.findAll();
    }

}
