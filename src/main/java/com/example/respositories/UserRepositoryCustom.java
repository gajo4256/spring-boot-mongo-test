package com.example.respositories;

import com.example.models.User;

public interface UserRepositoryCustom {
    public User getUserWhichNameEndsWithLetter(String character);
}
