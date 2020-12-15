package com.zzj.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties("handler")
public class Supply implements Serializable {
    private int suid;
    private Warehouse warehouse;
    private Goods goods;
    private int suinventory;
    private int sustatus;

    public int getSuid() {
        return suid;
    }

    @Override
    public String toString() {
        return "Supply{" +
                "suid=" + suid +
                ", warehouse=" + warehouse +
                ", goods=" + goods +
                ", suinventory=" + suinventory +
                ", sustatus=" + sustatus +
                '}';
    }

    public void setSuid(int suid) {
        this.suid = suid;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
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

    public Supply(int suid, Warehouse warehouse, Goods goods, int suinventory, int sustatus) {
        this.suid = suid;
        this.warehouse = warehouse;
        this.goods = goods;
        this.suinventory = suinventory;
        this.sustatus = sustatus;
    }

    public Supply() {
    }
}
