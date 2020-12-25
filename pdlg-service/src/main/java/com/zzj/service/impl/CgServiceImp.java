package com.zzj.service.impl;

import com.zzj.dao.CgDao;
import com.zzj.service.CgService;
import com.zzj.vo.CgVo;
import com.zzj.vo.Warehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CgServiceImp implements CgService {

    @Autowired
    CgDao cgDao;

    @Override
    public int cg(CgVo cgVo) {
        return cgDao.cg(cgVo);
    }

    @Override
    public int gkc(CgVo cgVo) {
        return cgDao.cg(cgVo);
    }
}
