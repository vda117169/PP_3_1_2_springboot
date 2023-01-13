package com.example.PP_3_1_2_springboot.service;

import com.example.PP_3_1_2_springboot.dao.UserDAO;
import com.example.PP_3_1_2_springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiсeImpl implements UserService {
    public final UserDAO userDAO;

    @Autowired
    public UserServiсeImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> allUser() {
        return userDAO.allUser();
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Override
    @Transactional
    public void deleteUser(User user) {
        userDAO.deleteUser(user);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Override
    @Transactional(readOnly = true)
    public User getIdUser(int id) {
        return userDAO.getIdUser(id);
    }

    @Override
    public User getUserById(int id) {
        return null;
    }
}
