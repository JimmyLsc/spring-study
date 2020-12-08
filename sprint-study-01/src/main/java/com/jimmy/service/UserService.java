package com.jimmy.service;

import com.jimmy.dao.UserDao;

public interface UserService {
    void showUser();
    void setUserDao(UserDao userDao);
}
