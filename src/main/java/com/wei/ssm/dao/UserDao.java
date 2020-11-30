package com.wei.ssm.dao;

import com.wei.ssm.model.User;

import java.util.List;

public interface UserDao {

    User queryUserById(String id);

    Integer save(User user);

    Integer delete(String id);

    List<User> queryUser();
}
