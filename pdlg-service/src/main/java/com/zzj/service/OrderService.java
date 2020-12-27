package com.zzj.service;


import com.zzj.vo.Order;
import com.zzj.vo.PageVo;


public interface OrderService {

    //查询所有订单a
    public PageVo<Order> queryAllOrder(Order order, int page, int rows) ;
}
