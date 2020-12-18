package com.zzj.controller;

import com.zzj.service.GoodBigSortService;
import com.zzj.vo.GoodBigSort;
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
public class GoodBigSortController {
    @Autowired
    GoodBigSortService goodBigSortService;
    //查询所有
    @RequestMapping("/queryAllGoodBigSort.action")
    @CrossOrigin
    @ResponseBody  //通知框架   返回的集合，vo，map  转成json格式  jackson.jar
    public PageVo<GoodBigSort> queryAllGoodBigSort(GoodBigSort goodBigSort,
                                                   @RequestParam(value = "page",defaultValue = "0")Integer page,
                                                   @RequestParam(value = "size",defaultValue = "0") Integer size){
        PageVo<GoodBigSort> pageVo = goodBigSortService.queryAllGoodBigSort(goodBigSort,page,size);
        return pageVo;
    }
    //所有大分类
    @RequestMapping("/queryAllGoodBigSortall.action")
    @CrossOrigin
    @ResponseBody
    public List<GoodBigSort> queryAllGoodBigSortall(GoodBigSort goodBigSort)
    {

        return goodBigSortService.queryAllGoodBigSortall(goodBigSort);
    }
    //添加
    @RequestMapping(value ="/addGoodBigSort.actio-n",produces = {"application/json;charset=utf-8"})
    @CrossOrigin
    @ResponseBody
    public String addGoodBigSort(GoodBigSort goodBigSort){
        int num=goodBigSortService.addGoodBigSort(goodBigSort);
        String msg="";
        if(num==1){
            msg="添加成功";
        }else{
            msg="添加失败";
        }
        return  msg;
    }
    //通过ID查
    @RequestMapping("/queryGoodBigSortBygbsid.action")
    @CrossOrigin
    @ResponseBody
    public GoodBigSort queryGoodBigSortBygbsid(int gbsid)
    {
        return goodBigSortService.queryGoodBigSortBygbsid(gbsid);
    }
    //修改
    @RequestMapping(value ="/updateGoodBigSort.action",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String updateGoodBigSort(GoodBigSort goodBigSort){
        int num=goodBigSortService.updateGoodBigSort(goodBigSort);
        String msg="";
        if(num==1){
            msg="修改成功";
        }else{
            msg="修改失败";
        }

        return  msg;
    }
    //删除
    @RequestMapping(value ="/deleteGoodBigSort.action",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String deleteGoodBigSort(int gbsid){

        int num=goodBigSortService.deleteGoodBigSort(gbsid);
        String msg="";
        if(num==1){
            msg="删除成功";
        }else{
            msg="删除失败";
        }
        return  msg;
    }
    //批量删除
    @RequestMapping("/deleteGoodBigSortduo.action")
    @ResponseBody
    public Map deleteGoodBigSortduo(String ids){
        System.out.println(ids);
        String[] idss =ids.split(",");
        int[] idsss = new int[idss.length];
        for (int i = 0; i < idss.length; i++) {
            idsss[i] = Integer.parseInt(idss[i]);
        }
        Map<String,String> map =new HashMap<String, String>() ;
        int num=goodBigSortService.deleteGoodBigSortduo(idsss);
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
    //通过ID查
    @RequestMapping("/queryGoodBigSortBygsid.action")
    @CrossOrigin
    @ResponseBody
    public GoodBigSort queryGoodBigSortBygsid(int gsid)
    {
        return goodBigSortService.queryGoodBigSortBygsid(gsid);
    }
}
