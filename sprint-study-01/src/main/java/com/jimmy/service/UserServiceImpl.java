package com.jimmy.service;

import com.jimmy.dao.UserDao;
import com.jimmy.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao = new UserDaoImpl();

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
    public void showUser() {
        userDao.showUser();
    }
}
