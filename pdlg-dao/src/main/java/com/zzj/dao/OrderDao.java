package com.zzj.dao;

import com.zzj.vo.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDao {
    //用户订单 根据用户ID查以及状态
    public List<Order> queryAllOrderUser(@Param("order") Order order,
                                     @Param("uid")int uid);
    //用户订单数量
    public int querycountOrderUser(@Param("order") Order order,
                                   @Param("uid")int uid);

    //商家订单 根据商家ID查以及状态
    public List<Order> queryAllOrderShang(@Param("order") Order order,
                                     @Param("sid")int sid);
    //商家订单数量
    public int querycountOrderShang(@Param("order") Order order,
                                     @Param("sid")int sid);

    //总店订单 根据状态
    public List<Order> queryAllOrderZong(@Param("order") Order order);
    //总店订单数量
    public int querycountOrderZong(@Param("order") Order order);

    //通过ID查订单
    public Order queryAllOrderByoid( int oid);
    //添加订单
    //通过ID查订单
    //修改订单状态
    public int updateOrder(int oid);
    //修改状态
    public int updateOrderzhuang(Order order);



}
