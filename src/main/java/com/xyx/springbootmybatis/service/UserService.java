package com.xyx.springbootmybatis.service;

import com.xyx.springbootmybatis.dao.UserDao;
import com.xyx.springbootmybatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> queryUser(){
        return userDao.selectUser();
    }

    public int addUser(User user){
        return this.userDao.addUser(user);
    }
}
