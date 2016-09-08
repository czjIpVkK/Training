package com.ynu.service;

import com.ynu.dto.User;
/**
 * Created by Vivianus on 2016/9/6.
 */
public interface UserService {

    public User find(String u_name);

    public void add(User user);

    public void updateByPrimaryKeySelective(User user);
}
