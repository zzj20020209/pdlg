package com.zzj.controller;

import com.zzj.service.WarehouseService;
import com.zzj.vo.Goods;
import com.zzj.vo.PageVo;
import com.zzj.vo.Warehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class WarehouseController {
    @Autowired
    WarehouseService warehouseService;
    //查询所有
    @RequestMapping("/queryWarehouse.action")
    @CrossOrigin
    @ResponseBody  //通知框架   返回的集合，vo，map  转成json格式  jackson.jar
    public PageVo<Warehouse> queryWarehouse(Warehouse warehouse,
                                        @RequestParam(value = "page",defaultValue = "0")Integer page,
                                        @RequestParam(value = "size",defaultValue = "0") Integer size){
        PageVo<Warehouse> pageVo = warehouseService.queryAllWarehouse(warehouse,page,size);
        return pageVo;
    }
    //添加22
    @RequestMapping(value ="/addWarehouse.action",produces = {"application/json;charset=utf-8"})
    @CrossOrigin
    @ResponseBody
    public String addWarehouse(Warehouse warehouse){
        int num=warehouseService.addWarehouse(warehouse);
        String msg="";
        if(num==1){
            msg="添加成功";
        }else{
            msg="添加失败";
        }
        return  msg;
    }
    //通过ID查dddll
    @RequestMapping("/queryWarehouseBywid.action")
    @CrossOrigin
    @ResponseBody
    public Warehouse queryWarehouseBygid(int wid)
    {
        return warehouseService.queryWarehouseBywid(wid);
    }
    //修改
    @RequestMapping(value ="/updateWarehouse.action",produces = {"application/json;charset=utf-8"})
    @CrossOrigin
    @ResponseBody
    public String updateWarehouse(Warehouse warehouse){
        int num=warehouseService.updateWarehouse(warehouse);
        String msg="";
        if(num==1){
            msg="修改成功";
        }else{
            msg="修改失败";
        }

        return  msg;
    }
    //删除
    @RequestMapping(value ="/deleteWarehouse.action",produces = {"application/json;charset=utf-8"})
    @CrossOrigin
    @ResponseBody
    public String deleteWarehouse(int wid){

        int num=warehouseService.deleteWarehouse(wid);
        System.out.println("num"+num);
        String msg="";
        if(num==1){
            msg="删除成功";
        }else{
            msg="删除失败";
        }
        return  msg;
    }
    //批量删除
    @RequestMapping("/deleteWarehouse.action")
    @CrossOrigin
    @ResponseBody
    public Map deleteWarehouse(String ids){
        System.out.println(ids);
        String[] idss =ids.split(",");
        int[] idsss = new int[idss.length];
        for (int i = 0; i < idss.length; i++) {
            idsss[i] = Integer.parseInt(idss[i]);
        }
        Map<String,String> map =new HashMap<String, String>() ;
        int num=warehouseService.deleteWarehouseduo(idsss);
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
}
