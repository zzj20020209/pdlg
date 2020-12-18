package com.zzj.service.impl;

import com.github.pagehelper.PageHelper;
import com.zzj.dao.GoodBigSortDao;
import com.zzj.service.GoodBigSortService;
import com.zzj.vo.GoodBigSort;
import com.zzj.vo.Goods;
import com.zzj.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodBigSortServiceImpl implements GoodBigSortService {
    @Autowired
    GoodBigSortDao goodBigSortDao;

    @Override
    public PageVo<GoodBigSort> queryAllGoodBigSort(GoodBigSort goodBigSort, int page, int rows) {
        PageVo<GoodBigSort> pageVo = new PageVo<>();

        //在需要分页的代码调用前 执行以下代码
        PageHelper.startPage(page, rows);
        //获取分页后 显示的数据集合
        pageVo.setRows(goodBigSortDao.queryAllGoodBigSort(goodBigSort));
        //获取总的记录数量
        pageVo.setTotal(goodBigSortDao.querycountGoodBigSort(goodBigSort));

        return pageVo;
    }

    @Override
    public List<GoodBigSort> queryAllGoodBigSortall(GoodBigSort goodBigSort) {
        return goodBigSortDao.queryAllGoodBigSort(goodBigSort);
    }

    @Override
    public int addGoodBigSort(GoodBigSort goodBigSort) {
        return goodBigSortDao.addGoodBigSort(goodBigSort);
    }

    @Override
    public GoodBigSort queryGoodBigSortBygbsid(int gbsid) {
        return goodBigSortDao.queryGoodBigSortBygbsid(gbsid);
    }

    @Override
    public int updateGoodBigSort(GoodBigSort goodBigSort) {
        return goodBigSortDao.updateGoodBigSort(goodBigSort);
    }

    @Override
    public int deleteGoodBigSort(int gbsid) {
        return goodBigSortDao.deleteGoodBigSort(gbsid);
    }

    @Override
    public int deleteGoodBigSortduo(int[] ids) {
        return goodBigSortDao.deleteGoodBigSortduo(ids);
    }

    @Override
    public GoodBigSort queryGoodBigSortBygsid(int gsid) {
        return goodBigSortDao.queryGoodBigSortBygsid(gsid);
    }
}
