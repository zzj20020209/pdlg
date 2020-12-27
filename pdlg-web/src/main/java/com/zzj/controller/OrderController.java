package com.zzj.controller;

import com.zzj.service.OrderService;
import com.zzj.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {
    @Autowired
    OrderService orderService;
    //查询所有
    @RequestMapping("/queryOrder.action")
    @CrossOrigin
    @ResponseBody  //通知框架   返回的集合，vo，map  转成json格式  jackson.jar
    public PageVo<Order> queryOrder(Order order,
                                    @RequestParam(value = "page",defaultValue = "0")Integer page,
                                    @RequestParam(value = "size",defaultValue = "0") Integer size){
        /*GoodBigSort goodBigSort=new GoodBigSort();
        goodBigSort.setGbsname(gbsname);
        GoodSort goodSort=new GoodSort();
        goodSort.setGoodBigSort(goodBigSort);
        goods.setGsid(goodSort);*/
        PageVo<Order> pageVo = orderService.queryAllOrder(order,page,size);
        return pageVo;
    }
}
