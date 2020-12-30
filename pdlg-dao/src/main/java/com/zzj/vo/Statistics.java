package com.zzj.vo;

public class Statistics {
    private String nian;
    private String times;
    private double price;
    private int oxcount;
    private String gname;

    public Statistics() {
    }

    public Statistics(String nian, String times, double price, int oxcount, String gname) {
        this.nian = nian;
        this.times = times;
        this.price = price;
        this.oxcount = oxcount;
        this.gname = gname;
    }

    public String getNian() {
        return nian;
    }

    public void setNian(String nian) {
        this.nian = nian;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getOxcount() {
        return oxcount;
    }

    public void setOxcount(int oxcount) {
        this.oxcount = oxcount;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }
}
