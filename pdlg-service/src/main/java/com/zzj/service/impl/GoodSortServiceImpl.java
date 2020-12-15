package com.zzj.service.impl;

import com.github.pagehelper.PageHelper;
import com.zzj.dao.GoodSortDao;
import com.zzj.service.GoodSortService;
import com.zzj.vo.GoodSort;
import com.zzj.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GoodSortServiceImpl implements GoodSortService {
    @Autowired
    GoodSortDao goodSortDao;


    @Override
    public int addGoodSortBybidsid(List<GoodSort> goodSortList) {
        return goodSortDao.addGoodSortBybidsid(goodSortList);
    }

    @Override
    public int deleteGoodSortBygbsid(int gbsid) {
        return goodSortDao.deleteGoodSortBygbsid(gbsid);
    }

    @Override
    public GoodSort queryGoodSortBygid(int gid) {
        return goodSortDao.queryGoodSortBygid(gid);
    }
}
