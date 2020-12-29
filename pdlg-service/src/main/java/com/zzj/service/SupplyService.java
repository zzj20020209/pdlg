package com.zzj.service;

import com.zzj.vo.Supply;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SupplyService {
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
    //根据商品id差仓库库存
    public Supply kccx(@Param("gid")int gid);
}
