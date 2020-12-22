package com.zzj.dao;

import com.zzj.vo.GoodsImage;

import java.util.List;

public interface GoodsImageDao {
    //通过商品ID查多个图片
    public List<GoodsImage> queryAllGoodsImageBygid(int gid);
    //添加多个图片
    public int addGoodsImageBygidgiurl(List<GoodsImage> goodsImageList);
    //删除
    public int deleteGoodsImageBygid(int gid);
}
