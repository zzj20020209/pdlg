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

    @Override
    public String toString() {
        return "Goods{" +
                "gid=" + gid +
                ", gname='" + gname + '\'' +
                ", gunit='" + gunit + '\'' +
                ", gprice=" + gprice +
                ", gimage='" + gimage + '\'' +
                ", gsid=" + gsid +
                ", gstatus=" + gstatus +
                '}';
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

    public Goods(int gid, String gname, String gunit, double gprice, String gimage, GoodSort gsid, int gstatus) {
        this.gid = gid;
        this.gname = gname;
        this.gunit = gunit;
        this.gprice = gprice;
        this.gimage = gimage;
        this.gsid = gsid;
        this.gstatus = gstatus;
    }
}
