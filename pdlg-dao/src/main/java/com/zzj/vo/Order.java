package com.zzj.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Date;

@JsonIgnoreProperties("handler")
public class Order implements Serializable {
    private int oid;
    private double oprice;
    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone="GMT+8")
    @JSONField(format = "yyyy-MM-dd" )
    private Date otime;
    private String oPayStatus;
    private String oLogistics;
    private String oSLogistics;
    private String oZLogistics;

    public Order() {
    }

    @Override
    public String toString() {
        return "Order{" +
                "oid=" + oid +
                ", oprice=" + oprice +
                ", otime=" + otime +
                ", oPayStatus='" + oPayStatus + '\'' +
                ", oLogistics='" + oLogistics + '\'' +
                ", oSLogistics='" + oSLogistics + '\'' +
                ", oZLogistics='" + oZLogistics + '\'' +
                '}';
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public double getOprice() {
        return oprice;
    }

    public void setOprice(double oprice) {
        this.oprice = oprice;
    }

    public Date getOtime() {
        return otime;
    }

    public void setOtime(Date otime) {
        this.otime = otime;
    }

    public String getoPayStatus() {
        return oPayStatus;
    }

    public void setoPayStatus(String oPayStatus) {
        this.oPayStatus = oPayStatus;
    }

    public String getoLogistics() {
        return oLogistics;
    }

    public void setoLogistics(String oLogistics) {
        this.oLogistics = oLogistics;
    }

    public String getoSLogistics() {
        return oSLogistics;
    }

    public void setoSLogistics(String oSLogistics) {
        this.oSLogistics = oSLogistics;
    }

    public String getoZLogistics() {
        return oZLogistics;
    }

    public void setoZLogistics(String oZLogistics) {
        this.oZLogistics = oZLogistics;
    }

    public Order(int oid, double oprice, Date otime, String oPayStatus, String oLogistics, String oSLogistics, String oZLogistics) {
        this.oid = oid;
        this.oprice = oprice;
        this.otime = otime;
        this.oPayStatus = oPayStatus;
        this.oLogistics = oLogistics;
        this.oSLogistics = oSLogistics;
        this.oZLogistics = oZLogistics;
    }
}
