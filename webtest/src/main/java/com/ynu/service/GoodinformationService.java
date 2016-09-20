package com.ynu.service;

import com.ynu.dto.Goodsinformation;

import java.util.List;

/**
 * Created by Vivianus on 2016/9/12.
 */
public interface GoodinformationService {

    public List<Goodsinformation> select();

    public Goodsinformation find(String u_name);
    public void deleteGoods(int g_id);
    public void UpdateGoods(Goodsinformation goodsinformation);
}
