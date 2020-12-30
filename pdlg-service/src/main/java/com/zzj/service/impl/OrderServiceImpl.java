package com.zzj.service.impl;

import com.github.pagehelper.PageHelper;
import com.zzj.dao.OrderDao;
import com.zzj.service.OrderService;
import com.zzj.vo.Goods;
import com.zzj.vo.Order;
import com.zzj.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderDao orderDao;
    @Override
    public PageVo<Order> queryAllOrderUser(Order order, int uid, int page, int rows) {
        PageVo<Order> pageVo = new PageVo<>();

        //在需要分页的代码调用前 执行以下代码a
        PageHelper.startPage(page, rows);
        //获取分页后 显示的数据集合
        pageVo.setRows(orderDao.queryAllOrderUser(order,uid));
        //获取总的记录数量
        pageVo.setTotal(orderDao.querycountOrderUser(order,uid));

        return pageVo;
    }

    @Override
    public PageVo<Order> queryAllOrderShang(Order order, int sid, int page, int rows) {
        PageVo<Order> pageVo = new PageVo<>();

        //在需要分页的代码调用前 执行以下代码a
        PageHelper.startPage(page, rows);
        //获取分页后 显示的数据集合
        pageVo.setRows(orderDao.queryAllOrderShang(order,sid));
        //获取总的记录数量
        pageVo.setTotal(orderDao.querycountOrderShang(order,sid));

        return pageVo;
    }

    @Override
    public PageVo<Order> queryAllOrderZong(Order order, int page, int rows) {
        PageVo<Order> pageVo = new PageVo<>();

        //在需要分页的代码调用前 执行以下代码a
        PageHelper.startPage(page, rows);
        //获取分页后 显示的数据集合
        pageVo.setRows(orderDao.queryAllOrderZong(order));
        //获取总的记录数量
        pageVo.setTotal(orderDao.querycountOrderZong(order));

        return pageVo;
    }

    @Override
    public int updateOrder(int oid) {
        return orderDao.updateOrder(oid);
    }

    @Override
    public Order queryAllOrderByoid(int oid) {
        return orderDao.queryAllOrderByoid(oid);
    }

    @Override
    public int updateOrderzhuang(Order order) {
        return orderDao.updateOrderzhuang(order);
    }

    @Override
    public int addOrder(Order order) {
        return orderDao.addOrder(order);
    }


}
