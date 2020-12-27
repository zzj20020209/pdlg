package com.zzj.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties("handler")
public class Goods implements Serializable {
    private  int gid;
    private String gname;
    private String gunit;
    private double gprice;
    private String gimage;
    private GoodSort gsid;
    private  int gstatus;
    private int gisshangjia;
    private double gshangjiaprice;

    private  int num;
    private String ids;
    //图片集合
    private List<GoodsImage> goodsImagelist;

    public Goods() {
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public int getNum() {
        return 1;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public List<GoodsImage> getGoodsImagelist() {
        return goodsImagelist;
    }

    public void setGoodsImagelist(List<GoodsImage> goodsImagelist) {
        this.goodsImagelist = goodsImagelist;
    }


    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGunit() {
        return gunit;
    }

    public void setGunit(String gunit) {
        this.gunit = gunit;
    }

    public double getGprice() {
        return gprice;
    }

    public void setGprice(double gprice) {
        this.gprice = gprice;
    }

    public String getGimage() {
        return gimage;
    }

    public void setGimage(String gimage) {
        this.gimage = gimage;
    }

    public GoodSort getGsid() {
        return gsid;
    }

    public void setGsid(GoodSort gsid) {
        this.gsid = gsid;
    }

    public int getGstatus() {
        return gstatus;
    }

    public void setGstatus(int gstatus) {
        this.gstatus = gstatus;
    }


    public int getGisshangjia() {
        return gisshangjia;
    }


    public void setGisshangjia(int gisshangjia) {
        this.gisshangjia = gisshangjia;
    }

    public double getGshangjiaprice() {
        return gshangjiaprice;
    }

    public void setGshangjiaprice(double gshangjiaprice) {
        this.gshangjiaprice = gshangjiaprice;
    }
}
