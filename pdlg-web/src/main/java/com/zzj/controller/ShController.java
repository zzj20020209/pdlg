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
    public List<Shvo> shcx(Shvo shvo,
                            @RequestParam(value = "page",defaultValue = "1") int page,
                            @RequestParam(value = "rows",defaultValue = "5")int rows){
        return shService.shcx(shvo,page,rows);
    }

    @CrossOrigin
    @RequestMapping("/shcxs")
    @ResponseBody
    public PageVo<Shvo> shcxs(Shvo shvo,
                                @RequestParam(value = "page",defaultValue = "1") int page,
                                @RequestParam(value = "rows",defaultValue = "5")int rows){
        return shService.shcxs(shvo,page,rows);
    }

    @CrossOrigin
    @RequestMapping("/shdel")
    @ResponseBody
    public String shdel(int sid){
        int num=shService.shdel(sid);

        if(num==1){
            return "删除成功";
        }

        return "删除失败";
    }

    @CrossOrigin
    @RequestMapping("/shcxdg")
    @ResponseBody
    public Shvo shcxdg(int sid){
        Shvo shvo=shService.shcxdg(sid);

        return shvo;
    }

    @CrossOrigin
    @RequestMapping("/shxg")
    @ResponseBody
    public String shxg(Shvo shvo){
        int num=shService.shxg(shvo);
        if(num==1){
            return "修改成功";
        }

        return "修改失败";
    }

    @CrossOrigin
    @RequestMapping("/shspcxs")
    @ResponseBody
    public PageVo<Shvo> shspcxs(Shvo shvo,
                              @RequestParam(value = "page",defaultValue = "1") int page,
                              @RequestParam(value = "rows",defaultValue = "5")int rows){
        return shService.shspcxs(shvo,page,rows);
    }

    @CrossOrigin
    @RequestMapping("/shzc")
    @ResponseBody
    public String shzc(Shvo shvo){
        int num=shService.shzc(shvo);
        if(num==1){
            return "注册成功";
        }
        return "注册失败";
    }

    @CrossOrigin
    @RequestMapping("/shspcg")
    @ResponseBody
    public String shspcg(int sid){
        int num=shService.shspcg(sid);
        if(num==1){
            return "审批成功";
        }
        return "审批失败";
    }

    @CrossOrigin
    @RequestMapping("/shspsb")
    @ResponseBody
    public String shspsb(int sid){
        int num=shService.shspsb(sid);
        if(num==1){
            return "审批成功";
        }
        return "审批失败";
    }
}
