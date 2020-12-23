package com.zzj.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties("handler")
public class GoodsImage implements Serializable {
    private int giid;
    private String giurl;
    private int gid;

    public GoodsImage() {
    }

    public GoodsImage(int giid, String giurl, int gid) {
        this.giid = giid;
        this.giurl = giurl;
        this.gid = gid;
    }

    @Override
    public String toString() {
        return "GoodsImage{" +
                "giid=" + giid +
                ", giurl='" + giurl + '\'' +
                ", gid=" + gid +
                '}';
    }

    public int getGiid() {
        return giid;
    }

    public void setGiid(int giid) {
        this.giid = giid;
    }

    public String getGiurl() {
        return giurl;
    }

    public void setGiurl(String giurl) {
        this.giurl = giurl;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }
}
