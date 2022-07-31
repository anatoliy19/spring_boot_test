package com.example.spring_boot.service;

import com.example.spring_boot.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    void addUser(User user);
    User getById(Long id);
    void update(Long id, User user);
    void delete(Long id);

}
