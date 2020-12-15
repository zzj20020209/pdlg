package com.zzj.service;

import com.zzj.vo.Goods;
import com.zzj.vo.PageVo;

public interface GoodsService {
    //条件查询所有
    public PageVo<Goods> queryAllGoods(Goods goods, int page, int rows) ;
    //添加商品
    public int addGoods(Goods goods);
    //通过ID查商品
    public Goods queryGoodsBygid(int gid);
    //修改商品
    public int updateGoods(Goods goods);
    //删除商品
    public int deleteGoods(int gid);
    //批量删除商品
    public int deleteGoodsduo(int[] ids);
}
