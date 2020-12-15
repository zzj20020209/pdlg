package com.zzj.service;

import com.zzj.vo.GoodSort;
import com.zzj.vo.PageVo;

import java.util.List;

public interface GoodSortService {
    //条件查询所有
    public PageVo<GoodSort> queryAllGoodSort(GoodSort goodSort, int page, int rows) ;
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
    //查询所有分类
    public List<GoodSort> queryAllGoodSortname(GoodSort goodSort);
}
