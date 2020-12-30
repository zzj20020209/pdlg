package com.zzj.service;

import com.zzj.vo.OrderXiang;
import com.zzj.vo.PageVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderXiangService {
    //通过订单ID查询订单详情
    public List<OrderXiang> queryAllOrderXiangByoid(int oid);
      //查询所有用户订单
    public PageVo<OrderXiang> queryAllOrderXiangUser(int uid,  String zhuangtai, int page, int rows) ;
  //查询所有商家订单
    public PageVo<OrderXiang> queryAllOrderXiangShang(int sid,String zhuangtai, int page, int rows) ;
    //查询所有订单
    public PageVo<OrderXiang> queryAllOrderXiangZong(String zhuangtai, int page, int rows) ;
    //修改仓库ID
    public int updateOrderXiangCang(@Param("oid")int oid,
                                    @Param("gid")int gid,
                                    @Param("wid")int wid);
    //添加订单
    public int addOrderXiang(@Param("orderXiang")OrderXiang orderXiang,
                             @Param("oid")int oid,
                             @Param("sid")int sid,
                             @Param("uid")int uid,
                             @Param("gid")int gid
    );
}
