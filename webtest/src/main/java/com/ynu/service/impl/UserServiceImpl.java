package com.ynu.service.impl;

import com.ynu.dto.User;
import com.ynu.mapper.UserMapper;
import com.ynu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Vivianus on 2016/9/6.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper mapper;
    public User find(String u_name) {
        return mapper.find(u_name);
    }
}
