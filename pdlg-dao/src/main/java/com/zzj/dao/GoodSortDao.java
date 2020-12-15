package com.zzj.dao;

import com.zzj.vo.GoodSort;
import com.zzj.vo.Goods;

import java.util.List;

public interface GoodSortDao {
    //添加
    public int addGoodSortBybidsid(List<GoodSort> goodSortList);
    //删除
    public int deleteGoodSortBygbsid(int gbsid);
    //通过商品ID查分类
    public GoodSort queryGoodSortBygid(int gid);
}
