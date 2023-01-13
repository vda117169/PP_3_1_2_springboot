package com.example.PP_3_1_2_springboot.dao;

import com.example.PP_3_1_2_springboot.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO{
    @PersistenceContext //(unitName = "User")
    private EntityManager entityManager;

    @Override
    @SuppressWarnings("uncheced")//Если бы я не анонсировала @SuppressWarnings ( "unchecked" ) здесь, у него возникла бы проблема с линией, где я хочу вернуть свой ResultList.
    public List<User> allUser() {
        return entityManager.createQuery("select g from User g", User.class).getResultList();
    }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);

    }

    @Override
    public void deleteUser(User user) {
        entityManager.remove(entityManager.find(User.class, user.getId()));

    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);


    }

    @Override
    @SuppressWarnings("uncheced")
    public User getIdUser(int id) {
        return entityManager.find(User.class, id);
    }
}
