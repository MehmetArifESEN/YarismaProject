package com.mehmet.repository;

import com.mehmet.entity.User;
import com.mehmet.utility.MyFactoryRepository;

public class UserRepository  extends MyFactoryRepository<User, Long> {
    public UserRepository() {
        super(new User());
    }
}
