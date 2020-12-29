package com.zzj.controller;

import com.zzj.service.SupplyService;
import com.zzj.vo.Goods;
import com.zzj.vo.Supply;
import com.zzj.vo.Warehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SupplyController {
    @Autowired
    SupplyService supplyService;
    @RequestMapping("/querySupplyBywid.action")
    @CrossOrigin
    @ResponseBody
    public List<Supply> querySupplyBywid(int wid)
    {
        return supplyService.querySupplyBywid(wid);
    }
    //根据商品ID查
    @RequestMapping("/querySupplyBygid.action")
    @CrossOrigin
    @ResponseBody
    public List<Supply> querySupplyBygid(int gid)
    {
        return supplyService.querySupplyBygid(gid);
    }


}
