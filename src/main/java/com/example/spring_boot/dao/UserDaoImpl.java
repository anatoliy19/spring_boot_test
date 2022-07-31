package com.example.spring_boot.dao;

import com.example.spring_boot.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("SELECT user FROM User user", User.class).getResultList();
    }
    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }
    @Override
    public User getById(Long id) {
        return entityManager.find(User.class, id);
    }
    @Override
    public void update(Long id, User user) {
        entityManager.merge(user);
    }
    @Override
    public void delete(Long id) {
        entityManager.remove(entityManager.find(User.class, id));
    }

}
