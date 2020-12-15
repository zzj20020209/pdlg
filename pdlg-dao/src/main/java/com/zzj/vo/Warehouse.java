package com.zzj.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties("handler")
public class Warehouse implements Serializable {
    private int wid;
    private String wname;
    private String waddress;
    private int wstatus;

    public Warehouse() {
    }

    public Warehouse(int wid, String wname, String waddress, int wstatus) {
        this.wid = wid;
        this.wname = wname;
        this.waddress = waddress;
        this.wstatus = wstatus;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "wid=" + wid +
                ", wname='" + wname + '\'' +
                ", waddress='" + waddress + '\'' +
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

    public int getWstatus() {
        return wstatus;
    }

    public void setWstatus(int wstatus) {
        this.wstatus = wstatus;
    }
}

