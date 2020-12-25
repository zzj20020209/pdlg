package com.zzj.service;

import com.zzj.vo.PageVo;
import com.zzj.vo.Warehouse;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WarehouseService {
    //查询所有
    public PageVo<Warehouse> queryAllWarehouse(Warehouse warehouse, int page, int rows) ;
    //添加仓库
    public int addWarehouse(Warehouse warehouse);
    //通过ID查仓库
    public Warehouse queryWarehouseBywid(int wid);
    //修改仓库
    public int updateWarehouse(Warehouse warehouse);
    //删除仓库
    public int deleteWarehouse(int wid);
    //批量删除
    public int deleteWarehouseduo(int[] ids);
    //根据供应ID查
    public Warehouse queryWarehouseBysuid(int suid);
    //所有
    public List<Warehouse> queryAllWarehouseall(Warehouse warehouse);
    //查询商品不在的仓库
    public List<Warehouse> queryAllWarehouseNOInwid(int wid);
    //库存增加
    public int updateWarehousekucunzeng(@Param("wid") int wid, @Param("count")int count);
    //库存减少
    public int updateWarehousekucunjian(@Param("wid") int wid, @Param("count")int count);
}
