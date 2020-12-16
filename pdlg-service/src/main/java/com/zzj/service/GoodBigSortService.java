package com.zzj.service;

import com.zzj.vo.GoodBigSort;
import com.zzj.vo.GoodSort;
import com.zzj.vo.PageVo;

import java.util.List;

public interface GoodBigSortService {
    //条件查询所有
    public PageVo<GoodBigSort> queryAllGoodBigSort(GoodBigSort goodBigSort, int page, int rows) ;
    public List<GoodBigSort> queryAllGoodBigSortall(GoodBigSort goodBigSort);
    //添加分类
    public int addGoodBigSort(GoodBigSort goodBigSort);
    //通过ID查分类
    public GoodBigSort queryGoodBigSortBygbsid(int gbsid);
    //修改分类
    public int updateGoodBigSort(GoodBigSort goodBigSort);
    //删除分类
    public int deleteGoodBigSort(int gbsid);
    //批量删除分类
    public int deleteGoodBigSortduo(int[] ids);
    //通过分类ID查大分类
    public GoodBigSort queryGoodBigSortBygsid(int gsid);
}
