package com.zzj.service.impl;

import com.zzj.dao.GwcDao;
import com.zzj.service.GwcService;
import com.zzj.vo.Gwc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GwcServiceImp implements GwcService {
    @Autowired
    GwcDao gwcDao;

    @Override
    public int addsp(Gwc gwc) {
        return gwcDao.addsp(gwc);
    }

    @Override
    public List<Gwc> gwccx(int uid) {
        return gwcDao.gwccx(uid);
    }

    @Override
    public int slgb(Gwc gwc) {
        return gwcDao.slgb(gwc);
    }

    @Override
    public Gwc gwcx(Gwc gwc) {
        return gwcDao.gwcx(gwc);
    }

    @Override
    public int scgwc(int gwid) {
        return gwcDao.scgwc(gwid);
    }

    @Override
    public Gwc gwidcx(int gwid) {
        return gwcDao.gwidcx(gwid);
    }
}
