package com.mehmet.service;

import com.mehmet.entity.User;
import com.mehmet.repository.UserRepository;
import com.mehmet.utility.MyFactoryService;

public class UserService extends MyFactoryService<UserRepository, User, Long> {
    public UserService() {
        super(new UserRepository());
    }
}
