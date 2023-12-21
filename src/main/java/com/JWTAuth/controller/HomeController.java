package com.JWTAuth.controller;

import com.JWTAuth.model.User;
import com.JWTAuth.service.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/public")
public class HomeController
{
    private UserDao userDao;
    @Autowired
    public HomeController(UserDao userDao)
    {
        this.userDao=userDao;
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return userDao.getAllUser();
    }

    @GetMapping("curr-user")
    public String getLoggedInUser(Principal principal)
    {
        return principal.getName();
    }
}
