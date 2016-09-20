package com.ynu.service;

import com.ynu.dto.User;

import java.util.List;

/**
 * Created by Vivianus on 2016/9/6.
 */
public interface UserService {

    public List<User> select();

    public User find(String u_name);

    public void add(User user);

    public void updateByPrimaryKeySelective(User user);

    public int finTypeId(String ut_name);
}
