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
    public PageVo<Order> queryAllOrder(Order order, int page, int rows) {
        PageVo<Order> pageVo = new PageVo<>();

        //在需要分页的代码调用前 执行以下代码
        PageHelper.startPage(page, rows);
        //获取分页后 显示的数据集合
        pageVo.setRows(orderDao.queryAllOrder(order));
        //获取总的记录数量
        pageVo.setTotal(orderDao.querycountOrder(order));

        return pageVo;
    }
}
