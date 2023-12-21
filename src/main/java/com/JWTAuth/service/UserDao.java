package com.JWTAuth.service;

import com.JWTAuth.model.User;

import java.util.List;

public interface UserDao
{
    List<User> getAllUser();
}
