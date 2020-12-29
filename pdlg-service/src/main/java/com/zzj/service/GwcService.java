package com.zzj.service;

import com.zzj.vo.Gwc;

import java.util.List;

public interface GwcService {
    //加入购物车
    public int addsp(Gwc gwc);
    //查询所有
    public List<Gwc> gwccx(int uid);
    //改变数量
    public int slgb(Gwc gwc);
    //根据商品名查询
    public Gwc gwcx(Gwc gwc);
    //购物车删除商品
    public int scgwc(int gwid);
}
