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
    public List<GoodSort> queryGoodSortBygid(int gid);
    //查询所有
    public List<GoodSort> queryGoodSort();
    //通过大分类查
    public List<GoodSort> queryGoodSortBygbsid(int gbsid);
    //查是否存在该分类
    public GoodSort cx(GoodSort goodSort);
}
