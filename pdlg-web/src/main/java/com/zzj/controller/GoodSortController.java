package com.zzj.controller;

import com.zzj.service.GoodSortService;
import com.zzj.vo.GoodBigSort;
import com.zzj.vo.GoodSmallsort;
import com.zzj.vo.GoodSort;
import com.zzj.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class GoodSortController {
    @Autowired
    GoodSortService goodSortService;

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

               /* List<UserroleInfo> userroleInfo1=userroleInfoService.queryByeid(employeeInfo.getId());
                if(userroleInfo1.size()>0){
                    userroleInfoService.deleteUserroleInfoByeid(employeeInfo.getId());
                }*/
                int numm=goodSortService.addGoodSortBybidsid(goodSortList);
                if(numm==idsss.length){
                    msg="设置成功";
                }else{
                    msg="设置失败";
                }

            }
        }else{
            goodSortService.deleteGoodSortBygbsid(goodBigSort.getGbsid());
        }

        return  msg;
    }
}
