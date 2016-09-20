package com.ynu.mapper;

import com.ynu.dto.Goodstype;

import java.util.List;

public interface GoodstypeMapper {
    int deleteByPrimaryKey(Integer gtId);

    int insert(Goodstype record);

    int insertSelective(Goodstype record);

    Goodstype selectByPrimaryKey(Integer gtId);

    int updateByPrimaryKeySelective(Goodstype record);

    public List<Goodstype> selectChildren(int gt_id);

    public Goodstype findFather(int gt_id);

    public List<Goodstype> selectAllType();
}