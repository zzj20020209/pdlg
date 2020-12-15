package com.zzj.dao;

import com.zzj.vo.Goodsloading;

import java.util.List;

public interface GoodsloadingDao {
    //条件查询上架
    public List<Goodsloading> queryAllGoodsloading(Goodsloading goodsloading);
    //条件查询上架数量
    public int querycountGoodsloading(Goodsloading goodsloading);
    //添加上架
    public int addGoodsloading(Goodsloading goodsloading);
    //通过ID查上架表
    public Goodsloading queryGoodsloadingByglid(int glid);
    //修改上架
    public int updateGoodsloading(Goodsloading goodsloading);
    //取消上架
    public int deleteGoodsloading(int glid);
    //批量下架
    public int deleteGoodsloadingduo(int[] ids);
}
