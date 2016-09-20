package com.ynu.service.impl;

import com.ynu.dto.User;
import com.ynu.mapper.UserMapper;
import com.ynu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Vivianus on 2016/9/6.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User find(String u_name) {
        return userMapper.find(u_name);
    }

    public void add(User user) {
        userMapper.add(user);
    }

    public void updateByPrimaryKeySelective(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }
    public List<User> select() {
        return userMapper.select();
    }
    public int finTypeId(String ut_name){
        return userMapper.findTypeId(ut_name);
    }
}
