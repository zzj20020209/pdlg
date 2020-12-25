package com.zzj.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties("handler")
public class GoodBigSort implements Serializable {
    private int gbsid;
    private String gbsname;
    private String gbsicon;
    private int gbsstatus;
    private List<Goods> goodsList;
    public GoodBigSort() {
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    @Override
    public String toString() {
        return "GoodBigSort{" +
                "gbsid=" + gbsid +
                ", gbsname='" + gbsname + '\'' +
                ", gbsicon='" + gbsicon + '\'' +
                ", gbsstatus=" + gbsstatus +
                '}';
    }

    public int getGbsid() {
        return gbsid;
    }

    public void setGbsid(int gbsid) {
        this.gbsid = gbsid;
    }

    public String getGbsname() {
        return gbsname;
    }

    public void setGbsname(String gbsname) {
        this.gbsname = gbsname;
    }

    public String getGbsicon() {
        return gbsicon;
    }

    public void setGbsicon(String gbsicon) {
        this.gbsicon = gbsicon;
    }

    public int getGbsstatus() {
        return gbsstatus;
    }

    public void setGbsstatus(int gbsstatus) {
        this.gbsstatus = gbsstatus;
    }

    public GoodBigSort(int gbsid, String gbsname, String gbsicon, int gbsstatus) {
        this.gbsid = gbsid;
        this.gbsname = gbsname;
        this.gbsicon = gbsicon;
        this.gbsstatus = gbsstatus;
    }
}
