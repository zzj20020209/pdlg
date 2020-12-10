package com.zzj.vo;

public class Shvo {
    int sid;
    String sname;
    String yhm;
    String password;
    String address;
    String stele;

    public Shvo(){}

    public Shvo(int sid, String sname, String yhm, String password, String address, String stele) {
        this.sid = sid;
        this.sname = sname;
        this.yhm = yhm;
        this.password = password;
        this.address = address;
        this.stele = stele;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getYhm() {
        return yhm;
    }

    public void setYhm(String yhm) {
        this.yhm = yhm;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStele() {
        return stele;
    }

    public void setStele(String stele) {
        this.stele = stele;
    }

    @Override
    public String toString() {
        return "Shvo{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", yhm='" + yhm + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", stele='" + stele + '\'' +
                '}';
    }
}