package com.zzj.dao;

import com.zzj.vo.Goods;
import com.zzj.vo.Gwc;

import java.util.List;

public interface GwcDao {
    //加入购物车
    public int addsp(Gwc gwc);
    //根据用户查购物车
    public List<Gwc> gwccx(int uid);
    //改变数量
    public int slgb(Gwc gwc);
    //根据商品名查询
    public Gwc gwcx(Gwc gwc);
    //购物车商品删除
    public int scgwc(int gwid);
    //根据购物车id查询
    public Gwc gwidcx(int gwid);
}
