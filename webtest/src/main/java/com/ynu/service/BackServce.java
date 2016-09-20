package com.ynu.service;

import com.ynu.dto.Admin;
import com.ynu.dto.Goodstype;
import com.ynu.dto.User;

import java.util.List;

/**
 * Created by Administrator on 2016/9/17.
 */
public interface BackServce {
    public User findUser(String u_name);
    public void deleteUser(int u_id);
    public void setUser(User user);
    public int finTypeId(String ut_name);
    public Admin FindAdmin(String A_name);
    public List<Goodstype> selectChildren(int gt_id);
    public Goodstype findFather(int gt_id);
    public void addType(Goodstype goodstype);
    public void deleteType(int gt_id);
    public List<Goodstype> selectAllType();
}
