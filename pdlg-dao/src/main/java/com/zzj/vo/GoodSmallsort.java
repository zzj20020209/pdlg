package com.zzj.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties("handler")
public class GoodSmallsort implements Serializable {
    private int gssid;
    private String gssname;

    public GoodSmallsort(int gssid, String gssname) {
        this.gssid = gssid;
        this.gssname = gssname;
    }

    @Override
    public String toString() {
        return "GoodSmallsort{" +
                "gssid=" + gssid +
                ", gssname='" + gssname + '\'' +
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

    public GoodSmallsort() {
    }
}
