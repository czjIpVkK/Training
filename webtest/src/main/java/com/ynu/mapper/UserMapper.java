package com.ynu.mapper;

import com.ynu.dto.User;
/**
 * Created by Vivianus on 2016/9/6.
 */
public interface UserMapper {

    public User find(String u_name);
}