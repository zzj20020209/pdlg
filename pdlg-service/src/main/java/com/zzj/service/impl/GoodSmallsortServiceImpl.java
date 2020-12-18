package com.zzj.service.impl;

import com.github.pagehelper.PageHelper;
import com.zzj.dao.GoodSmallsortDao;
import com.zzj.service.GoodSmallsortService;
import com.zzj.vo.GoodBigSort;
import com.zzj.vo.GoodSmallsort;
import com.zzj.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodSmallsortServiceImpl implements GoodSmallsortService {
    @Autowired
    GoodSmallsortDao goodSmallsortDao;

    @Override
    public PageVo<GoodSmallsort> queryAllGoodSmallsort(GoodSmallsort goodSmallsort, int page, int rows) {
        PageVo<GoodSmallsort> pageVo = new PageVo<>();

        //在需要分页的代码调用前 执行以下代码
        PageHelper.startPage(page, rows);
        //获取分页后 显示的数据集合
        pageVo.setRows(goodSmallsortDao.queryAllGoodSmallsort(goodSmallsort));
        //获取总的记录数量
        pageVo.setTotal(goodSmallsortDao.querycountGoodSmallsort(goodSmallsort));

        return pageVo;
    }

    @Override
    public int addGoodSmallsort(GoodSmallsort goodSmallsort) {
        return goodSmallsortDao.addGoodSmallsort(goodSmallsort);
    }

    @Override
    public GoodSmallsort queryGoodSmallsortBygssid(int gssid) {
        return goodSmallsortDao.queryGoodSmallsortBygssid(gssid);
    }

    @Override
    public int updateGoodSmallsort(GoodSmallsort goodSmallsort) {
        return goodSmallsortDao.updateGoodSmallsort(goodSmallsort);
    }

    @Override
    public int deleteGoodSmallsort(int gssid) {
        return goodSmallsortDao.deleteGoodSmallsort(gssid);
    }

    @Override
    public int deleteGoodSmallsortduo(int[] ids) {
        return goodSmallsortDao.deleteGoodSmallsortduo(ids);
    }

    @Override
    public GoodSmallsort queryGoodSmallsortBygsid(int gsid) {
        return goodSmallsortDao.queryGoodSmallsortBygsid(gsid);
    }

    @Override
    public List<GoodSmallsort> queryGoodSmallsortBygbsid(int gbsid) {
        return goodSmallsortDao.queryGoodSmallsortBygbsid(gbsid);
    }
}
