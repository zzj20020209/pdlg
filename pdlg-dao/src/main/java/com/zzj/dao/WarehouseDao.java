package com.zzj.dao;

import com.zzj.vo.Warehouse;

import java.util.List;

public interface WarehouseDao {
    //条件查询仓库
    public List<Warehouse> queryAllWarehouse(Warehouse warehouse);
    //条件查询仓库数量
    public int querycountWarehouse(Warehouse warehouse);
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
}
