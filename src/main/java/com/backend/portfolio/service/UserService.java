package com.backend.portfolio.service;

import com.backend.portfolio.dto.UserDto;
import com.backend.portfolio.model.User;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);
}
