package com.zzj.service;


import com.zzj.vo.Order;
import com.zzj.vo.PageVo;


public interface OrderService {

    //查询所有用户订单
    public PageVo<Order> queryAllOrderUser(Order order,int uid, int page, int rows) ;
    //查询所有商家订单
    public PageVo<Order> queryAllOrderShang(Order order,int sid, int page, int rows) ;
    //查询所有订单
    public PageVo<Order> queryAllOrderZong(Order order, int page, int rows) ;
}
