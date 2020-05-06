package com.xyx.springbootmybatis.dao;

import com.xyx.springbootmybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    List<User> selectUser();

    int addUser(User user);
}
