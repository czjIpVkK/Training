package com.ynu.mapper;

import com.ynu.dto.Admin;

public interface AdminMapper {
    int insertSelective(Admin record);

    Admin selectByName(String A_name);

    int updateByPrimaryKeySelective(Admin record);

    int deleteByPrimaryKey(int A_id);
}