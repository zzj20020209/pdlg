package com.zzj.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Date;

@JsonIgnoreProperties("handler")
public class Goodsloading implements Serializable {
    private int glid;
    private Supply supply;
    private double glprice;
    private Date glstarttime;
    private Date glendtime;
    private int glstatus;

    public Goodsloading() {
    }

    @Override
    public String toString() {
        return "Goodsloading{" +
                "glid=" + glid +
                ", supply=" + supply +
                ", glprice=" + glprice +
                ", glstarttime=" + glstarttime +
                ", glendtime=" + glendtime +
                ", glstatus=" + glstatus +
                '}';
    }

    public int getGlid() {
        return glid;
    }

    public void setGlid(int glid) {
        this.glid = glid;
    }

    public Supply getSupply() {
        return supply;
    }

    public void setSupply(Supply supply) {
        this.supply = supply;
    }

    public double getGlprice() {
        return glprice;
    }

    public void setGlprice(double glprice) {
        this.glprice = glprice;
    }

    public Date getGlstarttime() {
        return glstarttime;
    }

    public void setGlstarttime(Date glstarttime) {
        this.glstarttime = glstarttime;
    }

    public Date getGlendtime() {
        return glendtime;
    }

    public void setGlendtime(Date glendtime) {
        this.glendtime = glendtime;
    }

    public int getGlstatus() {
        return glstatus;
    }

    public void setGlstatus(int glstatus) {
        this.glstatus = glstatus;
    }

    public Goodsloading(int glid, Supply supply, double glprice, Date glstarttime, Date glendtime, int glstatus) {
        this.glid = glid;
        this.supply = supply;
        this.glprice = glprice;
        this.glstarttime = glstarttime;
        this.glendtime = glendtime;
        this.glstatus = glstatus;
    }
}
