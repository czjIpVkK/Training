package com.ynu.service.impl;

import com.ynu.dto.Admin;
import com.ynu.dto.Goodstype;
import com.ynu.dto.User;
import com.ynu.mapper.AdminMapper;
import com.ynu.mapper.GoodstypeMapper;
import com.ynu.mapper.UserMapper;
import com.ynu.service.BackServce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/9/17.
 */
@Service
public class BackServceImpl implements BackServce {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private AdminMapper adminMapper;
    @Autowired
    private GoodstypeMapper goodtypeMapper;
    public User findUser(String u_name){
        return userMapper.find(u_name);
    }

    public void deleteUser(int u_id){
     userMapper.deleteByPrimaryKey(u_id);
    }

    public void setUser(User user){
        userMapper.updateByPrimaryKeySelective(user);
    }
    public int finTypeId(String ut_name){
        return userMapper.findTypeId(ut_name);
    }
    public Admin FindAdmin(String A_name){
        return adminMapper.selectByName(A_name);
    }
    public List<Goodstype> selectChildren(int gt_id) {
            return goodtypeMapper.selectChildren(gt_id);
    }
    public Goodstype findFather(int gt_id){
        return goodtypeMapper.findFather(gt_id);
    }
    public void addType(Goodstype goodstype){
        goodtypeMapper.insertSelective(goodstype);
    }
    public void deleteType(int gt_id){
        goodtypeMapper.deleteByPrimaryKey(gt_id);
    }
    public List<Goodstype> selectAllType(){
        return goodtypeMapper.selectAllType();
    }


}
