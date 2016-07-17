package com.example.controllers;

import com.example.models.User;
import com.example.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/users")
@RestController
public class UserController {

    private final UserService userService;

    public UserController(final UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public User getTestUser() {
        return new User("123", "John", "Doe");
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveUser(@RequestBody User user) {
        userService.save(user);
    }

    @GetMapping("/{firstName}")
    public List<User> getAllByName(@PathVariable String firstName) {
        return userService.findByFirstName(firstName);
    }

    @GetMapping("/all")
    public List<User> getAll() {
        return userService.findAll();
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAll() {
        userService.deleteAll();
    }

}
