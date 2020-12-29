package com.zzj.controller;

import com.zzj.service.OrderService;
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
import java.util.ArrayList;
import java.util.List;

@Controller
public class OrderController {
    @Autowired
    OrderService orderService;
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
}
