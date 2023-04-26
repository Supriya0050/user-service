package com.example.userservice.service;

import com.example.userservice.dto.ResponseDto;
import com.example.userservice.entity.User;

public interface UserService {
    User saveUser(User user);

    ResponseDto getUser(Long userId);
}