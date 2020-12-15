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
    public PageVo<GoodSort> queryAllGoodSort(GoodSort goodSort, int page, int rows) {
        PageVo<GoodSort> pageVo = new PageVo<>();

        //在需要分页的代码调用前 执行以下代码
        PageHelper.startPage(page, rows);
        //获取分页后 显示的数据集合
        pageVo.setRows(goodSortDao.queryAllGoodSort(goodSort));
        //获取总的记录数量
        pageVo.setTotal(goodSortDao.querycountGoodSort(goodSort));

        return pageVo;
    }

    @Override
    public int addGoodSort(GoodSort goodSort) {
        return goodSortDao.addGoodSort(goodSort);
    }

    @Override
    public GoodSort queryGoodSortBygsid(int gsid) {
        return goodSortDao.queryGoodSortBygsid(gsid);
    }

    @Override
    public int updateGoodSort(GoodSort goodSort) {
        return goodSortDao.updateGoodSort(goodSort);
    }

    @Override
    public int deleteGoodSort(int gsid) {
        return goodSortDao.deleteGoodSort(gsid);
    }

    @Override
    public int deleteGoodsSortduo(int[] ids) {
        return goodSortDao.deleteGoodsSortduo(ids);
    }

    @Override
    public GoodSort queryGoodSortBygid(int gid) {
        return goodSortDao.queryGoodSortBygid(gid);
    }

    @Override
    public List<GoodSort> queryAllGoodSortname(GoodSort goodSort) {
        return goodSortDao.queryAllGoodSort( goodSort);
    }
}
