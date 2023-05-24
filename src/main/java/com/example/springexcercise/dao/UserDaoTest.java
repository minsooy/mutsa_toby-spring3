package com.example.springexcercise.dao;

import com.example.springexcercise.domain.User;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ConnectionMaker connectionMaker = new DConnectionMaker();
        UserDao userDao = new UserDao(connectionMaker);
        User user = new User();
        user.setId("7");
        user.setName("Test Class!");
        user.setPassword("12345");

        userDao.add(user);
        User selectedUser = userDao.get("7");
        System.out.println(selectedUser.getId());
        System.out.println(selectedUser.getName());
        System.out.println(selectedUser.getPassword());
    }
}
