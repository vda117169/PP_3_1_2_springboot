package com.example.PP_3_1_2_springboot.service;

import com.example.PP_3_1_2_springboot.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserService {
    List<User> allUser();//показать юзеров

    void addUser(User user);//добавить юзеров

    void deleteUser(User user);//удалить юзеров

    void updateUser(User user);//изменить юзеров

    User getIdUser(int id);//получить по id юзеров

    User getUserById(int id);
}
