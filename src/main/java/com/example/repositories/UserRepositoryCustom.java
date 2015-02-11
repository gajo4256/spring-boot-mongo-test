package com.example.repositories;

import com.example.models.User;

public interface UserRepositoryCustom {
    public User getUserWhichNameEndsWithLetter(String character);
}
