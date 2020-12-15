package com.zzj.controller;

import com.zzj.service.GoodSortService;
import com.zzj.vo.GoodSort;
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
public class GoodSortController {
    @Autowired
    GoodSortService goodSortService;
    //查询所有
    @RequestMapping("/queryAllGoodSort.action")
    @CrossOrigin
    @ResponseBody  //通知框架   返回的集合，vo，map  转成json格式  jackson.jar
    public PageVo<GoodSort> queryAllGoodSort(GoodSort goodSort,
                                             @RequestParam(value = "index",defaultValue = "0")Integer index,
                                             @RequestParam(value = "size",defaultValue = "0") Integer size){
        PageVo<GoodSort> pageVo = goodSortService.queryAllGoodSort(goodSort,index,size);
        return pageVo;
    }
    @RequestMapping("/queryAllGoodSortname.action")
    @CrossOrigin
    @ResponseBody  //通知框架   返回的集合，vo，map  转成json格式  jackson.jar
    public List<GoodSort> queryAllGoodSort(GoodSort goodSort){
        return goodSortService.queryAllGoodSortname(goodSort);
    }
    //添加
    @RequestMapping(value ="/addGoodSort.action",produces = {"application/json;charset=utf-8"})
    @CrossOrigin
    @ResponseBody
    public String addGoodSort(GoodSort goodSort){
        int num=goodSortService.addGoodSort(goodSort);
        String msg="";
        if(num==1){
            msg="添加成功";
        }else{
            msg="添加失败";
        }
        return  msg;
    }
    //通过ID查
    @RequestMapping("/queryGoodSortBygsid.action")
    @CrossOrigin
    @ResponseBody
    public GoodSort queryGoodSortBygsid(int gsid)
    {
        return goodSortService.queryGoodSortBygsid(gsid);
    }
    //修改
    @RequestMapping(value ="/updateGoodSort.action",produces = {"application/json;charset=utf-8"})
    @CrossOrigin
    @ResponseBody
    public String updateGoodSort(GoodSort goodSort){
        int num=goodSortService.updateGoodSort(goodSort);
        String msg="";
        if(num==1){
            msg="修改成功";
        }else{
            msg="修改失败";
        }

        return  msg;
    }
    //删除
    @RequestMapping(value ="/deleteGoodSort.action",produces = {"application/json;charset=utf-8"})
    @CrossOrigin
    @ResponseBody
    public String deleteGoodSort(int gsid){

        int num=goodSortService.deleteGoodSort(gsid);
        String msg="";
        if(num==1){
            msg="删除成功";
        }else{
            msg="删除失败";
        }
        return  msg;
    }
    //批量删除
    @RequestMapping("/deleteGoodsSortduo.action")
    @CrossOrigin
    @ResponseBody
    public Map deleteGoodsSortduo(String ids){
        System.out.println(ids);
        String[] idss =ids.split(",");
        int[] idsss = new int[idss.length];
        for (int i = 0; i < idss.length; i++) {
            idsss[i] = Integer.parseInt(idss[i]);
        }
        Map<String,String> map =new HashMap<String, String>() ;
        int num=goodSortService.deleteGoodsSortduo(idsss);
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
    //通过商品ID查
    @RequestMapping("/queryGoodSortBygid.action")
    @CrossOrigin
    @ResponseBody
    public GoodSort queryGoodSortBygid(int gid)
    {
        return goodSortService.queryGoodSortBygid(gid);
    }
}
