package com.zzj.dao;

import com.zzj.vo.Supply;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SupplyDao {
   /* //根据上架表查询
    public Supply querySupplyByglid(int glid);
    //添加供货
    public int addSupplyBywidgid(List<Supply> supplyList);
    //删除供货
    public int deleteSupplyBywid(int wid);*/
    //根据仓库ID查
    public List<Supply> querySupplyBywid(int wid);
    //退货
    public int deleteSupplyBysuidcount(@Param("suid") int suid, @Param("count")int count);
    //根据仓库ID以及商品ID查 (库存转移)
    public Supply querySupplyBywidgid(@Param("wid") int wid, @Param("gid")int gid);
    //添加单个
    public int addSupply(@Param("supply")Supply supply,
                         @Param("wid") int wid, @Param("gid")int gid);

    //减少库存
    public int updateSupplykucunjian(@Param("supply")Supply supply,
                         @Param("wid") int wid, @Param("gid")int gid);
    //增加库存
    public int updateSupplykucunzeng(@Param("supply")Supply supply,
                                     @Param("wid") int wid, @Param("gid")int gid);
}
