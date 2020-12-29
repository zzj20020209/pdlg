package com.zzj.controller;

import com.zzj.service.CgService;
import com.zzj.service.GoodsService;
import com.zzj.service.SupplyService;
import com.zzj.service.WarehouseService;
import com.zzj.vo.CgVo;
import com.zzj.vo.Goods;
import com.zzj.vo.Supply;
import com.zzj.vo.Warehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class CgController {

    @Autowired
    CgService cgService;
    @Autowired
    WarehouseService warehouseService;
    @Autowired
    SupplyService supplyService;
    @Autowired
    GoodsService goodsService;

    @PostMapping("/cg.action")
    public String cg(String str,String sl,String cid){
        List<CgVo> list=new ArrayList<>();
        String msg="";
        String[] strs = str.split(",");
        String[] sls=sl.split(",");
        String[] cids=cid.split(",");
        int[] ckid=new int[cids.length];
        int[] spid=new int[strs.length];
        int[] zsl=new int[sls.length];

        for (int i=0;i<strs.length;i++){
            ckid[i]=Integer.parseInt(cids[i]);
            spid[i]=Integer.parseInt(strs[i]);
            zsl[i]=Integer.parseInt(sls[i]);

            Warehouse warehouse=warehouseService.queryWarehouseBywid(ckid[i]);
            if(warehouse.getWskucun()>=zsl[i]){
                //System.out.println("库存足够可存放:"+(warehouse.getWskucun()-countstridss[i]));
                //第二步 通过仓库ID以及商品ID 查仓库商品关联表是否存在
                // 存在就修改现仓库库存    修改仓库商品关联表库存    修改选择仓库库存
                Supply supply=supplyService.querySupplyBywidgid(ckid[i],spid[i]);
                if(supply!=null){
                    System.out.println("存在啊"+supply);
                    Supply supply1=new Supply();
                    supply1.setSuinventory(zsl[i]);
                    int num2=supplyService.updateSupplykucunzeng(supply1,ckid[i],spid[i]);
                    int num4=warehouseService.updateWarehousekucunjian(ckid[i],zsl[i]);
                    Goods goods=goodsService.queryGoodsBygid(spid[i]);
                    msg=msg+goods.getGname()+"采购到"+warehouse.getWname()+"成功!"+" ";
                }else{
                    System.out.println("不存在啊");
                    Supply supplyadd=new Supply();
                    supplyadd.setSuinventory(zsl[i]);
                    int num2=supplyService.addSupply(supplyadd,ckid[i],spid[i]);
                    int num4=warehouseService.updateWarehousekucunjian(ckid[i],zsl[i]);
                    Goods goods=goodsService.queryGoodsBygid(spid[i]);
                    msg=msg+goods.getGname()+"采购到"+warehouse.getWname()+"成功!"+" ";
                    // 不存在就添加新的数据    修改现仓库数据和     修改选择仓库库存
                    /* Supply supplyadd=new Supply();
                     supplyadd.setSuinventory(countstridss[i]);
                     int num1=supplyService.addSupply(supplyadd,cangstridss[i],gidstridss[i]);
                     int num2=warehouseService.updateWarehousekucunzeng(wid,countstridss[i]);
                     int num3=warehouseService.updateWarehousekucunjian(cangstridss[i],countstridss[i]);
                     Goods goods=goodsService.queryGoodsBygid(gidstridss[i]);
                     str=str+goods.getGname()+"转移到"+warehouse.getWname()+"成功!"+" ";*/
                }
            }else{
                Goods goodsf=goodsService.queryGoodsBygid(spid[i]);
                msg=msg+goodsf.getGname()+"采购失败：【"+warehouse.getWname()+"】的库存不足!"+" ";
            }
        }
        return msg;
    }
}
