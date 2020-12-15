package com.zzj.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties("handler")
public class GoodSort implements Serializable {
    private int gsid;
    private String gsname;
    private  int gsstatus;

    public GoodSort() {
    }

    public GoodSort(int gsid, String gsname, int gsstatus) {
        this.gsid = gsid;
        this.gsname = gsname;
        this.gsstatus = gsstatus;
    }

    @Override
    public String toString() {
        return "GoodSort{" +
                "gsid=" + gsid +
                ", gsname='" + gsname + '\'' +
                ", gsstatus=" + gsstatus +
                '}';
    }

    public int getGsid() {
        return gsid;
    }

    public void setGsid(int gsid) {
        this.gsid = gsid;
    }

    public String getGsname() {
        return gsname;
    }

    public void setGsname(String gsname) {
        this.gsname = gsname;
    }

    public int getGsstatus() {
        return gsstatus;
    }

    public void setGsstatus(int gsstatus) {
        this.gsstatus = gsstatus;
    }
}
