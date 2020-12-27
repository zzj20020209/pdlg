package com.zzj.dao;

import com.zzj.vo.Goods;
import com.zzj.vo.Gwc;

import java.util.List;

public interface GwcDao {
    //加入购物车
    public int addsp(Gwc gwc);
    //根据用户查购物车
    public List<Gwc> gwccx(int uid);
}
