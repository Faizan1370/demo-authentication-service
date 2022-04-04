package com.faizan.service;

import java.util.Optional;

import com.faizan.dto.UserRequestDTO;
import com.faizan.entity.User;

public interface UserService {

    void addUser(UserRequestDTO user);

    void loginUser(String name, String passowrd);

    Optional<User> getUser(Long id);

}
