package com.zzj.controller;

import com.zzj.service.GoodSmallsortService;
import com.zzj.vo.GoodBigSort;
import com.zzj.vo.GoodSmallsort;
import com.zzj.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class GoodSmallsortController {
    @Autowired
    GoodSmallsortService goodSmallsortService;
    //查询所有
    @RequestMapping("/queryAllGoodSmallsort.action")
    @CrossOrigin
    @ResponseBody  //通知框架   返回的集合，vo，map  转成json格式  jackson.jar
    public PageVo<GoodSmallsort> queryAllGoodSmallsort(GoodSmallsort goodSmallsort,
                                                       @RequestParam(value = "page",defaultValue = "0")Integer page,
                                                       @RequestParam(value = "size",defaultValue = "0") Integer size){
        PageVo<GoodSmallsort> pageVo = goodSmallsortService.queryAllGoodSmallsort(goodSmallsort,page,size);
        return pageVo;
    }

    //添加
    @RequestMapping(value ="/addGoodSmallsort.actio-n",produces = {"application/json;charset=utf-8"})
    @CrossOrigin
    @ResponseBody
    public String addGoodSmallsort(GoodSmallsort goodSmallsort){
        int num=goodSmallsortService.addGoodSmallsort(goodSmallsort);
        String msg="";
        if(num==1){
            msg="添加成功";
        }else{
            msg="添加失败";
        }
        return  msg;
    }
    //通过ID查
    @RequestMapping("/queryGoodSmallsortBygssid.action")
    @CrossOrigin
    @ResponseBody
    public GoodSmallsort queryGoodSmallsortBygssid(int gssid)
    {
        return goodSmallsortService.queryGoodSmallsortBygssid(gssid);
    }
    //修改
    @RequestMapping(value ="/updateGoodSmallsort.action",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String updateGoodSmallsort(GoodSmallsort goodSmallsort){
        int num=goodSmallsortService.updateGoodSmallsort(goodSmallsort);
        String msg="";
        if(num==1){
            msg="修改成功";
        }else{
            msg="修改失败";
        }

        return  msg;
    }
    //删除
    @RequestMapping(value ="/deleteGoodSmallsort.action",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String deleteGoodSmallsort(int gssid){

        int num=goodSmallsortService.deleteGoodSmallsort(gssid);
        String msg="";
        if(num==1){
            msg="删除成功";
        }else{
            msg="删除失败";
        }
        return  msg;
    }
    //批量删除
    @RequestMapping("/deleteGoodSmallsortduo.action")
    @ResponseBody
    public Map deleteGoodSmallsortduo(String ids){
        System.out.println(ids);
        String[] idss =ids.split(",");
        int[] idsss = new int[idss.length];
        for (int i = 0; i < idss.length; i++) {
            idsss[i] = Integer.parseInt(idss[i]);
        }
        Map<String,String> map =new HashMap<String, String>() ;
        int num=goodSmallsortService.deleteGoodSmallsortduo(idsss);
        System.out.println("num"+num);
        System.out.println("idss.length"+idss.length);
        //num返回的是影响行数！！！！！！！
        if(num==idss.length){
            map.put("msg","删除成功");
            map.put("code","1");
        }else{
            map.put("msg","删除失败");
            map.put("code","0");
        }
        return  map;
    }
    //通过分类ID查小分类
    @RequestMapping("/queryGoodSmallsortBygsid.action")
    @CrossOrigin
    @ResponseBody
    public GoodSmallsort queryGoodSmallsortBygsid(int gsid)
    {
        return goodSmallsortService.queryGoodSmallsortBygsid(gsid);
    }

}
