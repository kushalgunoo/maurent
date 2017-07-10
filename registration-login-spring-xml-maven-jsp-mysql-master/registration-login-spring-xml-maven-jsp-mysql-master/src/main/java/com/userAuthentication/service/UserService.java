package com.userAuthentication.service;

import com.userAuthentication.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
