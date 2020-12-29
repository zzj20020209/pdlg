package com.zzj.controller;

import com.zzj.service.GwcService;
import com.zzj.vo.Gwc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
        String msg="";
        Gwc gwc1=gwcService.gwcx(gwc);
        if(gwc1!=null){
            gwcService.slgb(gwc);
            msg="成功添加至购物车";
        }else {
            gwcService.addsp(gwc);
            msg="成功添加至购物车";
        }
        return msg;
    }

    @PostMapping("/scgwc.action")
    public String scgwc(String gwid){

        String[] gwids = gwid.split(",");
        int[] gw=new int[gwids.length];

        for(int i =0;i<gwids.length;i++){
            gw[i]=Integer.parseInt(gwids[i]);
            gwcService.scgwc(gw[i]);
        }

        return "成功从购物车中移除";
    }

    @PostMapping("/gwidcx.action")
    public List<Gwc> gwidcx(String gwid){
        String[] gwids=gwid.split(",");
        int[] gw=new int[gwids.length];
        List<Gwc> gwc=new ArrayList<>();

        for (int i=0;i<gwids.length;i++){
            gw[i]=Integer.parseInt(gwids[i]);
            Gwc gwc1=gwcService.gwidcx(gw[i]);
            gwc.add(gwc1);
        }
        return gwc;
    }
}
