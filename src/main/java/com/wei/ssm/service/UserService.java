package com.wei.ssm.service;

import com.wei.ssm.model.User;

import java.util.List;

public interface UserService {

    User queryUserById(String id);

    Integer save(User user);

    Integer delete(String id);

    List<User> queryUser();
}
