package com.zzj.service.impl;

import com.github.pagehelper.PageHelper;
import com.zzj.dao.GoodsDao;
import com.zzj.service.GoodsService;
import com.zzj.vo.Goods;
import com.zzj.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsDao goodsDao;
    @Override
    public PageVo<Goods> queryAllGoods(Goods goods, int page, int rows) {
        PageVo<Goods> pageVo = new PageVo<>();

        //在需要分页的代码调用前 执行以下代码
        PageHelper.startPage(page, rows);
        //获取分页后 显示的数据集合
        pageVo.setRows(goodsDao.queryAllGoods(goods));
        //获取总的记录数量
        pageVo.setTotal(goodsDao.querycountGoods(goods));

        return pageVo;
    }

    @Override
    public int addGoods(Goods goods, int gssid) {
        return goodsDao.addGoods(goods,gssid);
    }


    @Override
    public Goods queryGoodsBygid(int gid) {
        return goodsDao.queryGoodsBygid(gid);
    }

    @Override
    public int updateGoods(Goods goods, int gssid) {
        return goodsDao.updateGoods(goods,gssid);
    }



    @Override
    public int deleteGoods(int gid) {
        return goodsDao.deleteGoods(gid);
    }

    @Override
    public int deleteGoodsduo(int[] ids) {
        return goodsDao.deleteGoodsduo(ids);
    }

    @Override
    public Goods queryGoodsBygname(Goods goods) {
        return goodsDao.queryGoodsBygname(goods);
    }

    @Override
    public Goods queryGoodsBysuid(int suid) {
        return goodsDao.queryGoodsBysuid(suid);
    }

    @Override
    public List<Goods> queryAllGoodsall(Goods goods) {
        return goodsDao.queryAllGoods(goods);
    }

    @Override
    public List<Goods> queryAllGoodsBywid(int wid) {
        return goodsDao.queryAllGoodsBywid(wid);
    }

    @Override
    public int goodsshangjia(int gid) {
        return goodsDao.goodsshangjia(gid);
    }

    @Override
    public int goodsxiajia(int gid) {
        return goodsDao.goodsxiajia(gid);
    }

    @Override
    public List<Goods> queryAllGoodsBybigsmaid(int gbsid, int gssid) {
        return goodsDao.queryAllGoodsBybigsmaid(gbsid,gssid);
    }

    @Override
    public List<Goods> queryAllGoodsBybigid(int gbsid) {
        return goodsDao.queryAllGoodsBybigid(gbsid);
    }
}
