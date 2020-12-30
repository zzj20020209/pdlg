package com.zzj.controller;

import com.zzj.service.GoodsService;
import com.zzj.service.OrderService;
import com.zzj.service.OrderXiangService;
import com.zzj.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

@Controller
public class OrderController {
    @Autowired
    OrderService orderService;
    @Autowired
    GoodsService goodsService;
    @Autowired
    OrderXiangService orderXiangService;
      //订单编号前缀
    public static final String PREFIX = "DD";
    //订单编号后缀（核心部分）
    private static long code;
    public static final int MACHINE_ID = 1;
    public final static String machineCode13 = "0";
    private final static AtomicInteger sub = new AtomicInteger(0);
    // 生成订单编号
    //查询所有用户订单
    @RequestMapping("/queryAllOrderUser.action")
    @CrossOrigin
    @ResponseBody  //通知框架   返回的集合，vo，map  转成json格式  jackson.jar
    public PageVo<Order> queryAllOrderUser(Order order,int uid,
                                    @RequestParam(value = "page",defaultValue = "0")Integer page,
                                    @RequestParam(value = "size",defaultValue = "0") Integer size){
        PageVo<Order> pageVo = orderService.queryAllOrderUser(order,uid,page,size);
        return pageVo;
    }

    //查询所有商家订单
    @RequestMapping("/queryAllOrderShang.action")
    @CrossOrigin
    @ResponseBody  //通知框架   返回的集合，vo，map  转成json格式  jackson.jar
    public PageVo<Order> queryAllOrderShang(Order order,int sid,
                                           @RequestParam(value = "page",defaultValue = "0")Integer page,
                                           @RequestParam(value = "size",defaultValue = "0") Integer size){
        PageVo<Order> pageVo = orderService.queryAllOrderShang(order,sid,page,size);
        return pageVo;
    }

    //查询所有订单
    @RequestMapping("/queryAllOrderZong.action")
    @CrossOrigin
    @ResponseBody  //通知框架   返回的集合，vo，map  转成json格式  jackson.jar
    public PageVo<Order> queryAllOrderZong(Order order,
                                           @RequestParam(value = "page",defaultValue = "0")Integer page,
                                           @RequestParam(value = "size",defaultValue = "0") Integer size){
        PageVo<Order> pageVo = orderService.queryAllOrderZong(order,page,size);
        return pageVo;
    }
    @RequestMapping(value ="/updateOrderzhuang.action",produces = {"application/json;charset=utf-8"})
    @CrossOrigin
    @ResponseBody
    public String updateOrderzhuang(Order order){
        String msg="";
        int num=orderService.updateOrderzhuang(order);
        if(num==1){
            msg="操作成功!";
        }else{
            msg="操作失败!";
        }
        return  msg;
    }
    //添加订单
    @RequestMapping(value ="/addOrder.action",produces = {"application/json;charset=utf-8"})
    @CrossOrigin
    @ResponseBody
    public String addOrder(Order order,String dmoney,String dcount,String gname,int shang,int uid){
        String msg="生成订单成功";
        int num=orderService.addOrder(order);
        if(num==1){
            String[] money = dmoney.split(",");
            int[] length = new int[money.length];
            String[] count = dcount.split(",");
            String[] name = gname.split(",");
            String idstr="";
            for(String s:name){
                    Goods goods1=new Goods();
                    goods1.setGname(s);
                    Goods goods=goodsService.queryGoodsBygname(goods1);
                idstr+=goods.getGid()+",";
            }
            String[] id = idstr.split(",");
            for(int i=0;i<length.length;i++){
                OrderXiang orderXiang=new OrderXiang();
                orderXiang.setOxcount(Integer.parseInt(count[i]));
                orderXiang.setOxprice(Integer.parseInt(money[i]));
                int num2=orderXiangService.addOrderXiang(orderXiang,order.getId(),shang,uid,
                        Integer.parseInt(id[i]));
            }

        }
        return msg;
    }
}
