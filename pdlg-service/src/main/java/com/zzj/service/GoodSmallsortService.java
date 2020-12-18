package com.zzj.service;

import com.zzj.vo.GoodBigSort;
import com.zzj.vo.GoodSmallsort;
import com.zzj.vo.PageVo;

import java.util.List;

public interface GoodSmallsortService {
    //条件查询所有
    public PageVo<GoodSmallsort> queryAllGoodSmallsort(GoodSmallsort goodSmallsort, int page, int rows) ;
    //添加分类
    public int addGoodSmallsort(GoodSmallsort goodSmallsort);
    //通过ID查分类
    public GoodSmallsort queryGoodSmallsortBygssid(int gssid);
    //修改分类
    public int updateGoodSmallsort(GoodSmallsort goodSmallsort);
    //删除分类
    public int deleteGoodSmallsort(int gssid);
    //批量删除分类
    public int deleteGoodSmallsortduo(int[] ids);
    //通过分类ID查小分类
    public GoodSmallsort queryGoodSmallsortBygsid(int gsid);
    //通过大分类ID查小分类
    public List<GoodSmallsort> queryGoodSmallsortBygbsid(int gbsid);
}
