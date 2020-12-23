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
}
