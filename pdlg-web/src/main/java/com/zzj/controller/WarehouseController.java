package com.zzj.controller;

import com.zzj.service.*;
import com.zzj.vo.*;
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
public class WarehouseController {
    @Autowired
    WarehouseService warehouseService;
    @Autowired
    SupplyService supplyService;
    @Autowired
    GoodsService goodsService;
    @Autowired
    OrderService orderService;
    @Autowired
    OrderXiangService orderXiangService;
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
    //查询所有
    @RequestMapping("/queryAllWarehouseall.action")
    @CrossOrigin
    @ResponseBody  //通知框架   返回的集合，vo，map  转成json格式  jackson.jar
    public List<Warehouse> queryAllWarehouseall(Warehouse warehouse){
        return warehouseService.queryAllWarehouseall(warehouse);
    }
    //查询所商品不在的仓库
    @RequestMapping("/queryAllWarehouseNOInwid.action")
    @CrossOrigin
    @ResponseBody  //通知框架   返回的集合，vo，map  转成json格式  jackson.jar
    public List<Warehouse> queryAllWarehouseNOInwid(int wid){
        return warehouseService.queryAllWarehouseNOInwid(wid);
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
        String msg="";
        List<Goods> goods=goodsService.queryAllGoodsBywid(wid);
        if(goods.size()==0){
            int num=warehouseService.deleteWarehouse(wid);
            if(num==1){
                msg="删除成功";
            }else{
                msg="删除失败";
            }
        }else{
            msg="请先将仓库清空在删除";
        }

        return  msg;
    }
    //批量删除
    @RequestMapping("/deleteWarehouseduo.action")
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
    //退货
    @RequestMapping(value ="/tuihuo.action",produces = {"application/json;charset=utf-8"})
    @CrossOrigin
    @ResponseBody
    public String tuihuo(String suidstr,String countstr,String cangstr){
        System.out.println("aaaaaa");
        String[] suidstrids =suidstr.split(",");
        int[] suidstridss = new int[suidstrids.length];

        String[] countstrids =countstr.split(",");
        int[] countstridss = new int[countstrids.length];

        String[] cangstrids =cangstr.split(",");
        int[] cangstridss = new int[cangstrids.length];
        int num=0;
        for (int i = 0; i < suidstridss.length; i++) {
            System.out.println(i+"suidlist"+Integer.parseInt(suidstrids[i]));
            System.out.println(i+"countslist"+Integer.parseInt(countstrids[i]));
            System.out.println(i+"canglist"+Integer.parseInt(cangstrids[i]));
           warehouseService.updateWarehousekucunzeng(Integer.parseInt(cangstrids[i]),Integer.parseInt(countstrids[i]));
            supplyService.deleteSupplyBysuidcount(Integer.parseInt(suidstrids[i]),Integer.parseInt(countstrids[i]));
            num++;
        }
        System.out.println("num"+num);
        String msg="";
        if(num==suidstridss.length){
            msg="退货成功";
        }else{
            msg="退货失败";
        }
        return  msg;
    }
    //转移
    @RequestMapping(value ="/zhuanyi.action",produces = {"application/json;charset=utf-8"})
    @CrossOrigin
    @ResponseBody
    public String zhuanyi(String suidstr,String gidstr,String countstr,String cangstr,Integer wid){
        String msg="";
        String str="";
        //仓库商品ID
        String[] suidstrids =suidstr.split(",");
        int[] suidstridss = new int[suidstrids.length];
        //数量集合
        String[] countstrids =countstr.split(",");
        int[] countstridss = new int[countstrids.length];
        //仓库集合
        String[] cangstrids =cangstr.split(",");
        int[] cangstridss = new int[cangstrids.length];
        //商品集合
        String[] gidstrids =gidstr.split(",");
        int[] gidstridss = new int[gidstrids.length];
        for (int i = 0; i < suidstridss.length; i++) {
            suidstridss[i] = Integer.parseInt(suidstrids[i]);
            countstridss[i] = Integer.parseInt(countstrids[i]);
            cangstridss[i] = Integer.parseInt(cangstrids[i]);
            gidstridss[i] = Integer.parseInt(gidstrids[i]);
            //第一步 先查选择的仓库要存放数量是否足够 200 300
             Warehouse warehouse=warehouseService.queryWarehouseBywid(cangstridss[i]);
             if(warehouse.getWskucun()>=countstridss[i]){
                 //System.out.println("库存足够可存放:"+(warehouse.getWskucun()-countstridss[i]));
                 //第二步 通过仓库ID以及商品ID 查仓库商品关联表是否存在
                 // 存在就修改现仓库库存    修改仓库商品关联表库存    修改选择仓库库存
                 Supply supply=supplyService.querySupplyBywidgid(cangstridss[i],gidstridss[i]);
                 if(supply!=null){
                    Supply supply1=new Supply();
                     supply1.setSuinventory(countstridss[i]);
                     int num1=supplyService.updateSupplykucunjian(countstridss[i],wid,gidstridss[i]);
                     int num2=supplyService.updateSupplykucunzeng(countstridss[i],cangstridss[i],gidstridss[i]);
                     int num3=warehouseService.updateWarehousekucunzeng(wid,countstridss[i]);
                     int num4=warehouseService.updateWarehousekucunjian(cangstridss[i],countstridss[i]);
                     Goods goods=goodsService.queryGoodsBygid(gidstridss[i]);
                     str=str+goods.getGname()+"转移到"+warehouse.getWname()+"成功!"+" ";
                 }else{
                     // 不存在就添加新的数据    修改现仓库数据和     修改选择仓库库存
                    Supply supplyadd=new Supply();
                     supplyadd.setSuinventory(countstridss[i]);
                     int num1=supplyService.updateSupplykucunjian(countstridss[i],wid,gidstridss[i]);
                     int num2=supplyService.addSupply(supplyadd,cangstridss[i],gidstridss[i]);
                     int num3=warehouseService.updateWarehousekucunzeng(wid,countstridss[i]);
                     int num4=warehouseService.updateWarehousekucunjian(cangstridss[i],countstridss[i]);
                     Goods goods=goodsService.queryGoodsBygid(gidstridss[i]);
                     str=str+goods.getGname()+"转移到"+warehouse.getWname()+"成功!"+" ";
                 }
             }else{
               Goods goodsf=goodsService.queryGoodsBygid(gidstridss[i]);
                 str=str+goodsf.getGname()+"转移到"+warehouse.getWname()+"失败!"+" ";
             }
        }
        return  str;
    }
    //出库
    @RequestMapping(value ="/chuku.action",produces = {"application/json;charset=utf-8"})
    @CrossOrigin
    @ResponseBody
    public String chuku(String suidstr,String gidstr,String countstr,String cangstr,int id){
        System.out.println("订单"+id);
        String str="";
        //仓库商品ID
        String[] suidstrids =suidstr.split(",");
        int[] suidstridss = new int[suidstrids.length];
        //数量集合
        String[] countstrids =countstr.split(",");
        int[] countstridss = new int[countstrids.length];
        //仓库集合
        String[] cangstrids =cangstr.split(",");
        int[] cangstridss = new int[cangstrids.length];
        //商品集合
        String[] gidstrids =gidstr.split(",");
        int[] gidstridss = new int[gidstrids.length];
        for (int i = 0; i < suidstridss.length; i++) {
            suidstridss[i] = Integer.parseInt(suidstrids[i]);
            countstridss[i] = Integer.parseInt(countstrids[i]);
            cangstridss[i] = Integer.parseInt(cangstrids[i]);
            gidstridss[i] = Integer.parseInt(gidstrids[i]);
            //先修改当前仓库库存
            Supply supply=supplyService.querySupplyBywidgid(cangstridss[i],gidstridss[i]);
            System.out.println("supply"+supply);
            int num1=orderXiangService.updateOrderXiangCang(id,gidstridss[i],cangstridss[i]);
           int num2=supplyService.updateSupplykucunjian(countstridss[i],cangstridss[i],gidstridss[i]);
            int num3=warehouseService.updateWarehousekucunzeng(cangstridss[i],countstridss[i]);
            str="出库成功!";

        }
        //判断是否订单都出库了
        Order order=orderService.queryAllOrderByoid(id);
        int num=0;
        for(int i=0;i<order.getOrderXiangList().size();i++){
           if(order.getOrderXiangList().get(i).getWarehouse()!=null){
               num++;
           }
         }
        System.out.println("现有的"+num);
        System.out.println("订单的的"+order.getOrderXiangList().size());
       if(num==order.getOrderXiangList().size()){
            //改变总店订单状态 已出库
            //改变商家订单状态 待收货
            Order order1=new Order();
            order1.setId(id);
            order1.setoZLogistics("已出库");
            order1.setoSLogistics("待收货");
            order1.setoYogistics("待配送");
            int num1=orderService.updateOrderzhuang(order1);
            str="订单已全库";
        }
        return str;
    }
}
