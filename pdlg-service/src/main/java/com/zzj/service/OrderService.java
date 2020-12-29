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
    //修改订单状态
    public int updateOrder(int oid);
    //通过ID查订单
    public Order queryAllOrderByoid( int oid);
    //修改状态
    public int updateOrderzhuang(Order order);
}
