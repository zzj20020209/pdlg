package com.zzj.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties("handler")
public class Goods implements Serializable {
    private  int gid;
    private String gname;
    private String gunit;
    private double gprice;
    private String gimage;
    private GoodSort goodSort;
    private  int gstatus;
    //aa

    public Goods() {
    }

    @Override
    public String toString() {
        return "Goods{" +
                "gid=" + gid +
                ", gname='" + gname + '\'' +
                ", gunit='" + gunit + '\'' +
                ", gprice=" + gprice +
                ", gimage='" + gimage + '\'' +
                ", goodSort=" + goodSort +
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

    public GoodSort getGoodSort() {
        return goodSort;
    }

    public void setGoodSort(GoodSort goodSort) {
        this.goodSort = goodSort;
    }

    public int getGstatus() {
        return gstatus;
    }

    public void setGstatus(int gstatus) {
        this.gstatus = gstatus;
    }

    public Goods(int gid, String gname, String gunit, double gprice, String gimage, GoodSort goodSort, int gstatus) {
        this.gid = gid;
        this.gname = gname;
        this.gunit = gunit;
        this.gprice = gprice;
        this.gimage = gimage;
        this.goodSort = goodSort;
        this.gstatus = gstatus;
    }
}
