package com.zzj.controller;

import com.zzj.service.OrderXiangService;
import com.zzj.vo.Goods;
import com.zzj.vo.OrderXiang;
import com.zzj.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderXiangController {
    @Autowired
    OrderXiangService orderXiangService;
   //查询所有用户订单
    @RequestMapping("/queryAllOrderXiangUser.action")
    @CrossOrigin
    @ResponseBody  //通知框架   返回的集合，vo，map  转成json格式  jackson.jar
    public PageVo<OrderXiang> queryAllOrderXiangUser(int uid,String zhuangtai,
                                                     @RequestParam(value = "page",defaultValue = "0")Integer page,
                                                     @RequestParam(value = "size",defaultValue = "0") Integer size){
        PageVo<OrderXiang> pageVo = orderXiangService.queryAllOrderXiangUser(uid,zhuangtai,page,size);
        return pageVo;
    }
    //根据订单ID查
    @RequestMapping("/queryAllOrderXiangByoid.action")
    @CrossOrigin
    @ResponseBody  //通知框架   返回的集合，vo，map  转成json格式  jackson.jar
    public List<OrderXiang> queryAllOrderXiangByoid(int oid){
        return orderXiangService.queryAllOrderXiangByoid(oid);
    }
}
