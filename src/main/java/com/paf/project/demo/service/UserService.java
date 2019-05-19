package com.paf.project.demo.service;

import com.paf.project.demo.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
