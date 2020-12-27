package com.zzj.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties("handler")
public class OrderXiang implements Serializable {
    private int oxid;
    private Order order;
    private Shvo shvo;
    private User user;
    private Goods goods;
    private Warehouse warehouse;
    private double oxprice;
    private int oxcount;

    public OrderXiang() {
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

    @Override
    public String toString() {
        return "OrderXiang{" +
                "oxid=" + oxid +
                ", order=" + order +
                ", shvo=" + shvo +
                ", user=" + user +
                ", goods=" + goods +
                ", warehouse=" + warehouse +
                ", oxprice=" + oxprice +
                ", oxcount=" + oxcount +
                '}';
    }

    public Shvo getShvo() {
        return shvo;
    }

    public void setShvo(Shvo shvo) {
        this.shvo = shvo;
    }

    public OrderXiang(int oxid, Order order, Shvo shvo, User user, Goods goods, Warehouse warehouse, double oxprice, int oxcount) {
        this.oxid = oxid;
        this.order = order;
        this.shvo = shvo;
        this.user = user;
        this.goods = goods;
        this.warehouse = warehouse;
        this.oxprice = oxprice;
        this.oxcount = oxcount;
    }
}
