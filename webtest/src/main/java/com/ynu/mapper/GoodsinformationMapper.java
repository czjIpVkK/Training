package com.ynu.mapper;

import com.ynu.dto.Goodsinformation;

import java.util.List;

/**
 * Created by Vivianus on 2016/9/12.
 */
public interface GoodsinformationMapper {
    public List<Goodsinformation> select();

    public Goodsinformation find(String u_name);
}
