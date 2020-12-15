package com.zzj.service;

import com.github.pagehelper.PageHelper;
import com.zzj.dao.ShDao;
import com.zzj.vo.PageVo;
import com.zzj.vo.Shvo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShServiceImp implements ShService{
    @Autowired
    ShDao shDao;

    @Override
    public List<Shvo> shcx(Shvo shvo, int page, int rows) {
        PageHelper.startPage(page, rows);
        return shDao.shcx(shvo);
    }

    @Override
    public PageVo<Shvo> shcxs(Shvo shvo, int page, int rows) {
        PageVo<Shvo> pageVo = new PageVo<>();

        //在需要分页的代码调用前 执行以下代码
        PageHelper.startPage(page, rows);
        //获取分页后 显示的数据集合
        pageVo.setRows(shDao.shcx(shvo));
        //获取总的记录数量
        pageVo.setTotal(shDao.shcxs(shvo));
        return pageVo;
    }

    @Override
    public int shdel(int sid) {
        return shDao.shdel(sid);
    }

    @Override
    public Shvo shcxdg(int sid) {
        return shDao.shcxdg(sid);
    }

    @Override
    public int shxg(Shvo shvo) {
        return shDao.shxg(shvo);
    }

    @Override
    public int shzc(Shvo shvo) {
        return shDao.shzc(shvo);
    }

    @Override
    public int shspcg(int sid) {
        return shDao.shspcg(sid);
    }

    @Override
    public int shspsb(int sid) {
        return shDao.shspsb(sid);
    }

    @Override
    public List<Shvo> shspcx(Shvo shvo, int page, int rows) {
        PageHelper.startPage(page, rows);
        return shDao.shspcx(shvo);
    }

    @Override
    public PageVo<Shvo> shspcxs(Shvo shvo, int page, int rows) {
        PageVo<Shvo> pageVo = new PageVo<>();

        //在需要分页的代码调用前 执行以下代码
        PageHelper.startPage(page, rows);
        //获取分页后 显示的数据集合
        pageVo.setRows(shDao.shspcx(shvo));
        //获取总的记录数量
        pageVo.setTotal(shDao.shspcxs(shvo));
        return pageVo;
    }

}
