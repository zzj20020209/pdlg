package com.zzj.service.impl;

import com.zzj.dao.SupplyDao;
import com.zzj.service.SupplyService;
import com.zzj.vo.Supply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplyServiceImpl implements SupplyService {
    @Autowired
    SupplyDao supplyDao;

    @Override
    public List<Supply> querySupplyBywid(int wid) {
        return supplyDao.querySupplyBywid(wid);
    }

    @Override
    public int deleteSupplyBysuidcount(int suid, int count) {
        return supplyDao.deleteSupplyBysuidcount(suid,count);
    }

    @Override
    public Supply querySupplyBywidgid(int wid, int gid) {
        return supplyDao.querySupplyBywidgid(wid,gid);
    }

    @Override
    public int addSupply(Supply supply, int wid, int gid) {
        return supplyDao.addSupply(supply,wid,gid);
    }

    @Override
    public int updateSupplykucunjian(int count, int wid, int gid) {
        return supplyDao.updateSupplykucunjian(count,wid,gid);
    }

    @Override
    public int updateSupplykucunzeng(int count, int wid, int gid) {
        return supplyDao.updateSupplykucunzeng(count,wid,gid);
    }



    @Override
    public List<Supply> querySupplyBygid(int gid) {
        return supplyDao.querySupplyBygid(gid);
    }
}
