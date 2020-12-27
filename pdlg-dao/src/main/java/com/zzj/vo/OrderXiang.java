package com.zzj.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties("handler")
public class OrderXiang implements Serializable {
    private int oxid;
    private Order order;
    private ShangHu shangHu;
    private User user;
    private Goods goods;
    private Warehouse warehouse;
    private double oxprice;
    private int oxcount;

    public OrderXiang() {
    }

    @Override
    public String toString() {
        return "OrderXiang{" +
                "oxid=" + oxid +
                ", order=" + order +
                ", shangHu=" + shangHu +
                ", user=" + user +
                ", goods=" + goods +
                ", warehouse=" + warehouse +
                ", oxprice=" + oxprice +
                ", oxcount=" + oxcount +
                '}';
    }

    public int getOxid() {
        return oxid;
    }

    public void setOxid(int oxid) {
        this.oxid = oxid;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public ShangHu getShangHu() {
        return shangHu;
    }

    public void setShangHu(ShangHu shangHu) {
        this.shangHu = shangHu;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public double getOxprice() {
        return oxprice;
    }

    public void setOxprice(double oxprice) {
        this.oxprice = oxprice;
    }

    public int getOxcount() {
        return oxcount;
    }

    public void setOxcount(int oxcount) {
        this.oxcount = oxcount;
    }

    public OrderXiang(int oxid, Order order, ShangHu shangHu, User user, Goods goods, Warehouse warehouse, double oxprice, int oxcount) {
        this.oxid = oxid;
        this.order = order;
        this.shangHu = shangHu;
        this.user = user;
        this.goods = goods;
        this.warehouse = warehouse;
        this.oxprice = oxprice;
        this.oxcount = oxcount;
    }
}
