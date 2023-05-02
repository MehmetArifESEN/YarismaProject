package com.mehmet.controller;

import com.mehmet.app.BAUtils;
import com.mehmet.entity.User;
import com.mehmet.service.UserService;

public class UserController {
    private UserService userService;

    public UserController(){
        this.userService = new UserService();
    }

    public void saveUser(User user){

        userService.save(user);
    }
}
