package com.hanger.dao;

import com.hanger.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by b.potapskiy on 03.02.15.
 */
@Repository
public class UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void createUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(user);
    }

    public User getUserById(int id) {
        Session session = sessionFactory.getCurrentSession();
        User user = (User) session.createQuery("from User where id = :id")
                .setParameter("id", id)
                .uniqueResult();
        return user;
    }

}
