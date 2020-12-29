package com.zzj.controller;

import com.zzj.service.GoodSmallsortService;
import com.zzj.service.GoodSortService;
import com.zzj.service.GoodsService;
import com.zzj.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
public class GoodSortController {
    @Autowired
    GoodSortService goodSortService;
    @Autowired
    GoodsService goodsService;
    @Autowired
    GoodSmallsortService goodSmallsortService;
    //通过商品ID查
    @RequestMapping("/queryGoodSort.action")
    @CrossOrigin
    @ResponseBody
    public  List<GoodSort> queryGoodSort()
    {
        return goodSortService.queryGoodSort();
    }
    //通过商品ID查
    @RequestMapping("/queryGoodSortBygid.action")
    @CrossOrigin
    @ResponseBody
    public  List<GoodSort> queryGoodSortBygid(int gid)
    {
        return goodSortService.queryGoodSortBygid(gid);
    }
    //添加
    @RequestMapping(value ="/addGoodSort.action",produces = {"application/json;charset=utf-8"})
    @CrossOrigin
    @ResponseBody
    public String addGoodSort(GoodBigSort goodBigSort , String mids){
        System.out.println(goodBigSort);
        System.out.println(mids);
        String msg="";
        List<GoodSort> goodSortList=new ArrayList<>();
        if(mids!=""){
            String[] midss = mids.split(",");
            int[] idsss = new int[midss.length];
            for(String s:midss){
                GoodSort goodSort=new GoodSort();
                goodSort.setGoodBigSort(goodBigSort);
                GoodSmallsort goodsmallsort=new GoodSmallsort();
                goodsmallsort.setGssid(Integer.parseInt(s));
                goodSort.setGoodSmallsort(goodsmallsort);
                goodSortList.add(goodSort);
                List<Goods> goods=goodsService.queryAllGoodsBybigsmaid(goodBigSort.getGbsid(),Integer.parseInt(s));
                if(goods.size()>0){
                    msg="设置失败,该分类下有商品!";
                }else{
                    goodSortService.deleteGoodSortBygbsid(goodBigSort.getGbsid());
                    int numm=goodSortService.addGoodSortBybidsid(goodSortList);
                    if(numm==idsss.length){
                        msg="设置成功";
                    }else{
                        msg="设置失败";
                    }
                }
            }
        }else{
            List<Goods> goods=goodsService.queryAllGoodsBybigid(goodBigSort.getGbsid());
            if(goods.size()>0){
                msg="设置失败,该分类下有商品!";
            }else{
                goodSortService.deleteGoodSortBygbsid(goodBigSort.getGbsid());
                msg="设置成功!";
            }
        }

        return  msg;
    }
}
