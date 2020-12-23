package com.zzj.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties("handler")
public class Warehouse implements Serializable {
    private int wid;
    private String wname;
    private String waddress;
    private int wzkucun;
    private int wskucun;
    private int wstatus;
    private List<Supply> supplyList;
    public Warehouse() {
    }

    public List<Supply> getSupplyList() {
        return supplyList;
    }

    public void setSupplyList(List<Supply> supplyList) {
        this.supplyList = supplyList;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "wid=" + wid +
                ", wname='" + wname + '\'' +
                ", waddress='" + waddress + '\'' +
                ", wzkucun=" + wzkucun +
                ", wskucun=" + wskucun +
                ", wstatus=" + wstatus +
                '}';
    }

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public String getWaddress() {
        return waddress;
    }

    public void setWaddress(String waddress) {
        this.waddress = waddress;
    }

    public int getWzkucun() {
        return wzkucun;
    }

    public void setWzkucun(int wzkucun) {
        this.wzkucun = wzkucun;
    }

    public int getWskucun() {
        return wskucun;
    }

    public void setWskucun(int wskucun) {
        this.wskucun = wskucun;
    }

    public int getWstatus() {
        return wstatus;
    }

    public void setWstatus(int wstatus) {
        this.wstatus = wstatus;
    }

    public Warehouse(int wid, String wname, String waddress, int wzkucun, int wskucun, int wstatus) {
        this.wid = wid;
        this.wname = wname;
        this.waddress = waddress;
        this.wzkucun = wzkucun;
        this.wskucun = wskucun;
        this.wstatus = wstatus;
    }
}

