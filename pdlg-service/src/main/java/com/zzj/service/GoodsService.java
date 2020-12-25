package com.zzj.service;

import com.zzj.vo.Goods;
import com.zzj.vo.PageVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsService {
    //条件查询所有
    public PageVo<Goods> queryAllGoods(Goods goods, int page, int rows) ;
    //添加商品
    public int addGoods(@Param("goods") Goods goods,
                        @Param("gssid")int gssid);
    //通过ID查商品
    public Goods queryGoodsBygid(int gid);
    //修改商品
    public int updateGoods(@Param("goods") Goods goods,
                           @Param("gssid")int gssid);
    //删除商品
    public int deleteGoods(int gid);
    //批量删除商品
    public int deleteGoodsduo(int[] ids);
    //查
    public Goods queryGoodsBygname(Goods goods);
    //根据供应ID查
    public Goods queryGoodsBysuid(int suid);
    //所有
    public List<Goods> queryAllGoodsall(Goods goods);
    //根据仓库ID查
    public List<Goods> queryAllGoodsBywid(int  wid);

}
