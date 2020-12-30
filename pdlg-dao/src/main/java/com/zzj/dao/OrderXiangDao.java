package com.zzj.dao;

import com.zzj.vo.Order;
import com.zzj.vo.OrderXiang;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderXiangDao {
    //通过订单ID查询订单详情
    public List<OrderXiang> queryAllOrderXiangByoid(int oid);

    //用户订单 根据用户ID查以及状态
    public List<OrderXiang> queryAllOrderXiangUser(@Param("uid")int uid, @Param("zhuangtai") String zhuangtai);
    //用户订单数量
    public int querycountOrderXiangUser(@Param("uid")int uid, @Param("zhuangtai") String zhuangtai);

    //商家订单 根据商家ID查以及状态
    public List<OrderXiang> queryAllOrderXiangShang(@Param("sid")int sid, @Param("zhuangtai") String zhuangtai);
    //商家订单数量
    public int querycountOrderXiangShang(@Param("sid")int sid, @Param("zhuangtai") String zhuangtai);

    //总店订单 根据状态
    public List<OrderXiang> queryAllOrderXiangZong(@Param("zhuangtai") String zhuangtai );
    //总店订单数量
    public int querycountOrderXiangZong(@Param("zhuangtai") String zhuangtai);
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
