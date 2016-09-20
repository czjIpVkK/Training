package com.ynu.mapper;

import com.ynu.dto.User;

import java.util.List;

/**
 * Created by Vivianus on 2016/9/6.
 */
public interface UserMapper {

    public User find(String u_name);

    public void add(User user);

    public void updateByPrimaryKeySelective(User user);

    public void deleteByPrimaryKey(int u_id);

    public List<User> select();

    public int findTypeId(String ut_name);
}
