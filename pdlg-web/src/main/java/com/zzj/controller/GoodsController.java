package com.zzj.controller;

import com.zzj.service.GoodsImageService;
import com.zzj.service.GoodsService;
import com.zzj.vo.GoodBigSort;
import com.zzj.vo.Goods;
import com.zzj.vo.GoodsImage;
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
public class GoodsController {
    @Autowired
    GoodsService goodsService;
    @Autowired
    GoodsImageService goodsImageService;
    //查询所有
    @RequestMapping("/queryGoods.action")
    @CrossOrigin
    @ResponseBody  //通知框架   返回的集合，vo，map  转成json格式  jackson.jar
    public PageVo<Goods> queryGoods(Goods goods,
                                    @RequestParam(value = "page",defaultValue = "0")Integer page,
                                    @RequestParam(value = "size",defaultValue = "0") Integer size){
        PageVo<Goods> pageVo = goodsService.queryAllGoods(goods,page,size);
        System.out.println("page"+goods);
        return pageVo;
    }
    //查询所有
    @RequestMapping("/queryAllGoodsall.action")
    @CrossOrigin
    @ResponseBody  //通知框架   返回的集合，vo，map  转成json格式  jackson.jar
    public List<Goods> queryAllGoodsall(Goods goods){
        return goodsService.queryAllGoodsall(goods);
    }
    //根据仓库id查
    //查询所有
    @RequestMapping("/queryAllGoodsBywid.action")
    @CrossOrigin
    @ResponseBody  //通知框架   返回的集合，vo，map  转成json格式  jackson.jar
    public List<Goods> queryAllGoodsBywid(int wid){
        return goodsService.queryAllGoodsBywid(wid);
    }


    //添加22
    @RequestMapping(value ="/addGoods.action",produces = {"application/json;charset=utf-8"})
    @CrossOrigin
    @ResponseBody
    public String addGoods(Goods goods,@RequestParam(value = "gssid")Integer gssid,String mids){
        String msg="";
        List<GoodsImage> goodsImageList=new ArrayList<>();
        /*System.out.println(mids);
        String[] midss = mids.split(",");
        goodsService.addGoods(goods,gssid);
        Goods goods1=goodsService.queryGoodsBygname(goods);
        for(String s:midss){
            GoodsImage goodsImage1=new GoodsImage();
            goodsImage1.setGid(goods1.getGid());
            goodsImage1.setGiurl(s);
            System.out.println("/"+goodsImage1);
        }*/
       if(mids!=""){
            goodsService.addGoods(goods,gssid);
           Goods goods1=goodsService.queryGoodsBygname(goods);
            String[] midss = mids.split(",");
            for(String s:midss){
                GoodsImage goodsImage1=new GoodsImage();
                goodsImage1.setGid(goods1.getGid());
                goodsImage1.setGiurl(s);
                goodsImageList.add(goodsImage1);
            }
            int numm=goodsImageService.addGoodsImageBygidgiurl(goodsImageList);
            if(numm==midss.length){
                msg="添加成功";
            }else{
                msg="添加失败";
            }
        }else{
            int num=goodsService.addGoods(goods,gssid);
            if(num==1){
                msg="添加成功";
            }else{
                msg="添加失败";
            }
        }
        return  msg;
    }
    //通过ID查dddll
    @RequestMapping("/queryGoodsBygid.action")
    @CrossOrigin
    @ResponseBody
    public Goods queryGoodsBygid(int gid)
    {
        return goodsService.queryGoodsBygid(gid);
    }
    //修改
    @RequestMapping(value ="/updateGoods.action",produces = {"application/json;charset=utf-8"})
    @CrossOrigin
    @ResponseBody
    public String updateGoods(Goods goods,@RequestParam(value = "gssid")Integer gssid,String mids){
        List<GoodsImage> goodsImageList=new ArrayList<>();
        String msg="";
        if(mids!=""){
            int num=goodsImageService.deleteGoodsImageBygid(goods.getGid());
            System.out.println("num"+num);
            String[] midss = mids.split(",");
            for(String s:midss){
                GoodsImage goodsImage1=new GoodsImage();
                goodsImage1.setGid(goods.getGid());
                goodsImage1.setGiurl(s);
                goodsImageList.add(goodsImage1);
            }
            int numm=goodsImageService.addGoodsImageBygidgiurl(goodsImageList);
            int nummm=goodsService.updateGoods(goods,gssid);
            if(numm==midss.length){
                msg="修改成功";
            }else{
                msg="修改失败";
            }
        }else{
            int num=goodsService.updateGoods(goods,gssid);
            if(num==1){
                msg="修改成功";
            }else{
                msg="修改失败";
            }
        }
        return  msg;
    }
    //删除
    @RequestMapping(value ="/deleteGoods.action",produces = {"application/json;charset=utf-8"})
    @CrossOrigin
    @ResponseBody
    public String deleteGoods(int gid){

        int num=goodsService.deleteGoods(gid);
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
    @RequestMapping("/deletezhanghao.action")
    @CrossOrigin
    @ResponseBody
    public Map deleteemp(String ids){
        System.out.println(ids);
        String[] idss =ids.split(",");
        int[] idsss = new int[idss.length];
        for (int i = 0; i < idss.length; i++) {
            idsss[i] = Integer.parseInt(idss[i]);
        }
        Map<String,String> map =new HashMap<String, String>() ;
        int num=goodsService.deleteGoodsduo(idsss);
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
    //上架
    @RequestMapping(value ="/goodsshangjia.action",produces = {"application/json;charset=utf-8"})
    @CrossOrigin
    @ResponseBody
    public String goodsshangjia(int gid){

        int num=goodsService.goodsshangjia(gid);
        String msg="";
        if(num==1){
            msg="上架成功";
        }else{
            msg="上架失败";
        }
        return  msg;
    }
    //下架
    @RequestMapping(value ="/goodsxiajia.action",produces = {"application/json;charset=utf-8"})
    @CrossOrigin
    @ResponseBody
    public String goodsxiajia(int gid){

        int num=goodsService.goodsxiajia(gid);
        String msg="";
        if(num==1){
            msg="下架成功";
        }else{
            msg="下架失败";
        }
        return  msg;
    }
}
