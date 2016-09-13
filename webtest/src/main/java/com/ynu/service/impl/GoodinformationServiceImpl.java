package com.ynu.service.impl;

import com.ynu.dto.Goodsinformation;
import com.ynu.mapper.GoodsinformationMapper;
import com.ynu.service.GoodinformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Vivianus on 2016/9/12.
 */
@Service
public class GoodinformationServiceImpl implements GoodinformationService{

    @Autowired
    private GoodsinformationMapper goodsinformationMapper;

    public List<Goodsinformation> select() {
        return goodsinformationMapper.select();
    }

    public Goodsinformation find(String u_name){
        return goodsinformationMapper.find(u_name);
    }
}
