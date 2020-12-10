package com.zzj.controller;

import com.zzj.service.ShService;
import com.zzj.vo.PageVo;
import com.zzj.vo.Shvo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ShController {
    @Autowired
    ShService shService;

    @CrossOrigin
    @RequestMapping("/shcx")
    @ResponseBody
    public List<Shvo> gyscx(Shvo shvo,
                            @RequestParam(value = "page",defaultValue = "1") int page,
                            @RequestParam(value = "rows",defaultValue = "5")int rows){
        return shService.shcx(shvo,page,rows);
    }

    @CrossOrigin
    @RequestMapping("/shcxs")
    @ResponseBody
    public PageVo<Shvo> gyscxfy(Shvo shvo,
                                @RequestParam(value = "page",defaultValue = "1") int page,
                                @RequestParam(value = "rows",defaultValue = "5")int rows){
        System.out.println(shvo+"1111");
        return shService.shcxs(shvo,page,rows);
    }
}
