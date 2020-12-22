package com.zzj.service.impl;

import com.zzj.dao.GoodsImageDao;
import com.zzj.service.GoodsImageService;
import com.zzj.vo.GoodsImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsImageServiceImpl implements GoodsImageService {
    @Autowired
    GoodsImageDao goodsImageDao;

    @Override
    public List<GoodsImage> queryAllGoodsImageBygid(int gid) {
        return goodsImageDao.queryAllGoodsImageBygid(gid);
    }

    @Override
    public int addGoodsImageBygidgiurl(List<GoodsImage> goodsImageList) {
        return goodsImageDao.addGoodsImageBygidgiurl(goodsImageList);
    }

    @Override
    public int deleteGoodsImageBygid(int gid) {
        return goodsImageDao.deleteGoodsImageBygid(gid);
    }
}
