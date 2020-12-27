package com.zzj.controller;

import com.zzj.service.GwcService;
import com.zzj.vo.Gwc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class GwcController {
    @Autowired
    GwcService gwcService;

    @PostMapping("/gwcx.action")
    public List<Gwc> cxsy(int uid){
        return gwcService.gwccx(uid);
    }

    @PostMapping("/gw.action")
    public String addgw(Gwc gwc){
        String msg="添加出错";
        int num=gwcService.addsp(gwc);
        if(num==1){
            msg="成功添加至购物车";
        }
        return msg;
    }
}
