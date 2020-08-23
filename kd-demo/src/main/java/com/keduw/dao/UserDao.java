package com.keduw.dao;

import com.keduw.pojo.User;

import java.util.List;

public interface UserDao {

    //查询所有用户
    public List<User> findAll() throws Exception;


    //根据条件进行用户查询
    public User findByCondition(User user) throws Exception;

}
