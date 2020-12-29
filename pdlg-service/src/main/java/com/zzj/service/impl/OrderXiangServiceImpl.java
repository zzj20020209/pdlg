package com.zzj.service.impl;

import com.github.pagehelper.PageHelper;
import com.zzj.dao.OrderXiangDao;
import com.zzj.service.OrderXiangService;
import com.zzj.vo.OrderXiang;
import com.zzj.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderXiangServiceImpl implements OrderXiangService {
    @Autowired
    OrderXiangDao orderXiangDao;

    @Override
    public List<OrderXiang> queryAllOrderXiangByoid(int oid) {
        return orderXiangDao.queryAllOrderXiangByoid(oid);
    }

    @Override
    public PageVo<OrderXiang> queryAllOrderXiangUser(int uid, String zhuangtai, int page, int rows) {
        PageVo<OrderXiang> pageVo = new PageVo<>();

        //在需要分页的代码调用前 执行以下代码a
        PageHelper.startPage(page, rows);
        //获取分页后 显示的数据集合
        pageVo.setRows(orderXiangDao.queryAllOrderXiangUser(uid,zhuangtai));
        //获取总的记录数量
        pageVo.setTotal(orderXiangDao.querycountOrderXiangUser(uid,zhuangtai));

        return pageVo;
    }

    @Override
    public PageVo<OrderXiang> queryAllOrderXiangShang(int sid, String zhuangtai, int page, int rows) {
        PageVo<OrderXiang> pageVo = new PageVo<>();

        //在需要分页的代码调用前 执行以下代码a
        PageHelper.startPage(page, rows);
        //获取分页后 显示的数据集合
        pageVo.setRows(orderXiangDao.queryAllOrderXiangShang(sid,zhuangtai));
        //获取总的记录数量
        pageVo.setTotal(orderXiangDao.querycountOrderXiangShang(sid,zhuangtai));

        return pageVo;
    }

    @Override
    public PageVo<OrderXiang> queryAllOrderXiangZong(String zhuangtai, int page, int rows) {
        PageVo<OrderXiang> pageVo = new PageVo<>();

        //在需要分页的代码调用前 执行以下代码a
        PageHelper.startPage(page, rows);
        //获取分页后 显示的数据集合
        pageVo.setRows(orderXiangDao.queryAllOrderXiangZong(zhuangtai));
        //获取总的记录数量
        pageVo.setTotal(orderXiangDao.querycountOrderXiangZong(zhuangtai));

        return pageVo;
    }

    @Override
    public int updateOrderXiangCang(int oid, int gid, int wid) {
        return orderXiangDao.updateOrderXiangCang(oid,gid,wid);
    }
}
