package com.zzj.vo;

public class CgVo {
    int suid;
    int wid;
    int sid;
    int suinventory;
    int sustatus;

    public CgVo(){}

    public CgVo(int suid, int wid, int sid, int suinventory, int sustatus) {
        this.suid = suid;
        this.wid = wid;
        this.sid = sid;
        this.suinventory = suinventory;
        this.sustatus = sustatus;
    }

    public int getSuid() {
        return suid;
    }

    public void setSuid(int suid) {
        this.suid = suid;
    }

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getSuinventory() {
        return suinventory;
    }

    public void setSuinventory(int suinventory) {
        this.suinventory = suinventory;
    }

    public int getSustatus() {
        return sustatus;
    }

    public void setSustatus(int sustatus) {
        this.sustatus = sustatus;
    }

    @Override
    public String toString() {
        return "CgVo{" +
                "suid=" + suid +
                ", wid=" + wid +
                ", sid=" + sid +
                ", suinventory=" + suinventory +
                ", sustatus=" + sustatus +
                '}';
    }
}
