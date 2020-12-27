package com.zzj.dao;

import com.zzj.vo.Order;

import java.util.List;

public interface OrderDao {
    //所有订单 分三种: 用户 商家 总店a
    public List<Order> queryAllOrder(Order order);
    //订单数量
    public int querycountOrder(Order order);
    //添加订单
    //通过ID查订单
    //修改订单

}
