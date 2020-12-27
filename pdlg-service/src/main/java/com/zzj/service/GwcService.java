package com.zzj.service;

import com.zzj.vo.Gwc;

import java.util.List;

public interface GwcService {
    //加入购物车
    public int addsp(Gwc gwc);
    //查询所有
    public List<Gwc> gwccx(int uid);
}
