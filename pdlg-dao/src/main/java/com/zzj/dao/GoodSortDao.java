package com.zzj.dao;

import com.zzj.vo.GoodSort;

import java.util.List;

public interface GoodSortDao {
    //条件查询所有
    public List<GoodSort> queryAllGoodSort(GoodSort goodSort);
    //条件查询所有数量
    public int querycountGoodSort(GoodSort goodSort);
    //添加分类
    public int addGoodSort(GoodSort goodSort);
    //通过ID查分类
    public GoodSort queryGoodSortBygsid(int gsid);
    //修改分类
    public int updateGoodSort(GoodSort goodSort);
    //删除分类
    public int deleteGoodSort(int gsid);
    //批量删除分类
    public int deleteGoodsSortduo(int[] ids);
    //通过商品ID查所属分类
    public GoodSort queryGoodSortBygid(int gid);
}
