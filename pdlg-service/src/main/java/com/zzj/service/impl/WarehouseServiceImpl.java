package com.zzj.service.impl;

import com.github.pagehelper.PageHelper;
import com.zzj.dao.WarehouseDao;
import com.zzj.service.WarehouseService;
import com.zzj.vo.PageVo;
import com.zzj.vo.Warehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WarehouseServiceImpl implements WarehouseService {
    @Autowired
    WarehouseDao warehouseDao;

    @Override
    public PageVo<Warehouse> queryAllWarehouse(Warehouse warehouse, int page, int rows) {
        PageVo<Warehouse> pageVo = new PageVo<>();

        //在需要分页的代码调用前 执行以下代码
        PageHelper.startPage(page, rows);
        //获取分页后 显示的数据集合
        pageVo.setRows(warehouseDao.queryAllWarehouse(warehouse));
        //获取总的记录数量
        pageVo.setTotal(warehouseDao.querycountWarehouse(warehouse));

        return pageVo;
    }

    @Override
    public int addWarehouse(Warehouse warehouse) {
        return warehouseDao.addWarehouse(warehouse);
    }

    @Override
    public Warehouse queryWarehouseBywid(int wid) {
        return warehouseDao.queryWarehouseBywid(wid);
    }

    @Override
    public int updateWarehouse(Warehouse warehouse) {
        return warehouseDao.updateWarehouse(warehouse);
    }

    @Override
    public int deleteWarehouse(int wid) {
        return warehouseDao.deleteWarehouse(wid);
    }

    @Override
    public int deleteWarehouseduo(int[] ids) {
        return warehouseDao.deleteWarehouseduo(ids);
    }

    @Override
    public Warehouse queryWarehouseBysuid(int suid) {
        return warehouseDao.queryWarehouseBysuid(suid);
    }
}
