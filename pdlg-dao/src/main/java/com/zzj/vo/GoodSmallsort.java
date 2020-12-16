package com.zzj.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties("handler")
public class GoodSmallsort implements Serializable {
    private int gssid;
    private String gssname;
    private String gssicon;
    private int gssstatus;

    public GoodSmallsort() {
    }

    @Override
    public String toString() {
        return "GoodSmallsort{" +
                "gssid=" + gssid +
                ", gssname='" + gssname + '\'' +
                ", gssicon='" + gssicon + '\'' +
                ", gssstatus=" + gssstatus +
                '}';
    }

    public int getGssid() {
        return gssid;
    }

    public void setGssid(int gssid) {
        this.gssid = gssid;
    }

    public String getGssname() {
        return gssname;
    }

    public void setGssname(String gssname) {
        this.gssname = gssname;
    }

    public String getGssicon() {
        return gssicon;
    }

    public void setGssicon(String gssicon) {
        this.gssicon = gssicon;
    }

    public int getGssstatus() {
        return gssstatus;
    }

    public void setGssstatus(int gssstatus) {
        this.gssstatus = gssstatus;
    }

    public GoodSmallsort(int gssid, String gssname, String gssicon, int gssstatus) {
        this.gssid = gssid;
        this.gssname = gssname;
        this.gssicon = gssicon;
        this.gssstatus = gssstatus;
    }
}
