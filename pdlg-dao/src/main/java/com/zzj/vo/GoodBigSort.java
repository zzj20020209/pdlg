package com.zzj.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties("handler")
public class GoodBigSort implements Serializable {
    private int gbsid;
    private String gbsname;

    public GoodBigSort() {
    }

    public GoodBigSort(int gbsid, String gbsname) {
        this.gbsid = gbsid;
        this.gbsname = gbsname;
    }

    @Override
    public String toString() {
        return "GoodBigSort{" +
                "gbsid=" + gbsid +
                ", gbsname='" + gbsname + '\'' +
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
}
