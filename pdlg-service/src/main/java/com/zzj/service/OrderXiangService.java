package com.zzj.service;

import com.zzj.vo.OrderXiang;
import com.zzj.vo.PageVo;

public interface OrderXiangService {
      //查询所有用户订单
    public PageVo<OrderXiang> queryAllOrderXiangUser(int uid,  String zhuangtai, int page, int rows) ;
  //查询所有商家订单
    public PageVo<OrderXiang> queryAllOrderXiangShang(int sid,String zhuangtai, int page, int rows) ;
    //查询所有订单
    public PageVo<OrderXiang> queryAllOrderXiangZong(String zhuangtai, int page, int rows) ;
}
