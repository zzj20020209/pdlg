package com.zzj.dao;

import com.zzj.vo.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsDao {
    //条件查询所有
    public List<Goods> queryAllGoods(Goods goods);
    //条件查询所有数量
    public int querycountGoods(Goods goods);
    //添加商品
    public int addGoods(@Param("goods") Goods goods,
                        @Param("gssid")int gssid);
    //通过ID查商品
    public Goods queryGoodsBygid(int gid);
    //查
    public Goods queryGoodsBygname(Goods goods);
    //修改商品
    public int updateGoods(@Param("goods") Goods goods,
                           @Param("gssid")int gssid);
    //删除商品
    public int deleteGoods(int gid);
    //批量删除商品
    public int deleteGoodsduo(int[] ids);
    //根据供应ID查
    public Goods queryGoodsBysuid(int suid);
    //根据仓库ID查
    public List<Goods> queryAllGoodsBywid(int  wid);

}
