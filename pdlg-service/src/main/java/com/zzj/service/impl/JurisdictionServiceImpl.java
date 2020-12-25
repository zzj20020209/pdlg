package com.zzj.service.impl;

import com.zzj.dao.JurisdictionDao;
import com.zzj.service.JurisdictionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JurisdictionServiceImpl implements JurisdictionService {
    @Autowired
    JurisdictionDao jurisdictionDao;

    @Override
    public int addEmployeeJurisdiction(int eid, String rids) {
        String[] id = rids.split(",");
        int num = 0;
        jurisdictionDao.delEmployeeJurisdiction(eid);
        for (int i = 0; i < id.length; i++) {
            num = jurisdictionDao.addEmployeeJurisdiction(eid, Integer.parseInt(id[i]));
        }
        return num;
    }

    @Override
    public int addRoleJurisdiction(int rid, String mids) {
        String[] id = mids.split(",");
        int num = 0;
        jurisdictionDao.delRoleJurisdiction(rid);
        for (int i = 0; i < id.length; i++) {
            num = jurisdictionDao.addRoleJurisdiction(rid, Integer.parseInt(id[i]));
        }
        return num;
    }
}
