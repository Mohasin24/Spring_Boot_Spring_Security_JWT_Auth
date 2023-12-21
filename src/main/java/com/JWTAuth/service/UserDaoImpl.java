package com.JWTAuth.service;

import com.JWTAuth.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserDaoImpl implements UserDao
{

    private List<User> list = new ArrayList<>();
    public UserDaoImpl(){
        list.add(new User(UUID.randomUUID().toString(),"Mohasin","admin@gmail.com"));
        list.add(new User(UUID.randomUUID().toString(),"Ramesh","ramesh@gmail.com"));
        list.add(new User(UUID.randomUUID().toString(),"Sana","sana@gmail.com"));
    }

    @Override
    public List<User> getAllUser() {
        return list;
    }
}
