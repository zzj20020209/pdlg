package com.zzj.service;

import com.zzj.dao.YgDao;
import com.zzj.vo.YgVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YgServiceImp implements YgService{

    @Autowired
    YgDao ygDao;

    @Override
    public YgVo dl(String username) {
        return ygDao.dl(username);
    }
}
