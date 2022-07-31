package com.example.spring_boot.service;

import com.example.spring_boot.dao.UserDao;
import com.example.spring_boot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Transactional
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Transactional
    @Override
    public User getById(Long id) {
        return userDao.getById(id);
    }

    @Transactional
    @Override
    public void update(Long id, User user) {
        userDao.update(id, user);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }
}
