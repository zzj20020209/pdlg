package com.zzj.vo;

public class Gwc {
    int gwid;
    int uid;
    String gwname;
    String gwunit;
    float gwprice;
    String gwimage;
    int gwsl;

    public Gwc(){}

    public Gwc(int gwid, int uid, String gwname, String gwunit, float gwprice, String gwimage, int gwsl) {
        this.gwid = gwid;
        this.uid = uid;
        this.gwname = gwname;
        this.gwunit = gwunit;
        this.gwprice = gwprice;
        this.gwimage = gwimage;
        this.gwsl = gwsl;
    }

    public int getGwid() {
        return gwid;
    }

    public void setGwid(int gwid) {
        this.gwid = gwid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getGwname() {
        return gwname;
    }

    public void setGwname(String gwname) {
        this.gwname = gwname;
    }

    public String getGwunit() {
        return gwunit;
    }

    public void setGwunit(String gwunit) {
        this.gwunit = gwunit;
    }

    public float getGwprice() {
        return gwprice;
    }

    public void setGwprice(float gwprice) {
        this.gwprice = gwprice;
    }

    public String getGwimage() {
        return gwimage;
    }

    public void setGwimage(String gwimage) {
        this.gwimage = gwimage;
    }

    public int getGwsl() {
        return gwsl;
    }

    public void setGwsl(int gwsl) {
        this.gwsl = gwsl;
    }

    @Override
    public String toString() {
        return "Gwc{" +
                "gwid=" + gwid +
                ", uid=" + uid +
                ", gwname='" + gwname + '\'' +
                ", gwunit='" + gwunit + '\'' +
                ", gwprice=" + gwprice +
                ", gwimage='" + gwimage + '\'' +
                ", gwsl=" + gwsl +
                '}';
    }
}
