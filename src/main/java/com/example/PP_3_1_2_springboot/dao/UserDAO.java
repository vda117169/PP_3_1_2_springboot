package com.example.PP_3_1_2_springboot.dao;

import com.example.PP_3_1_2_springboot.model.User;

import java.util.List;

public interface UserDAO {
    List<User> allUser();//показать юзеров

    void addUser(User user);//добавить юзеров

    void deleteUser(User user);//удалить юзеров

    void updateUser(User user);//изменить юзеров

    User getIdUser(int id);//получить по id юзеров
}
