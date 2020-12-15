package com.zzj.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties("handler")
public class OrderXiang implements Serializable {
    private int oxid;
    private Order order;
    private ShangHu shangHu;
    private User user;
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

    public OrderXiang(int oxid, Order order, ShangHu shangHu, User user, double oxprice, int oxcount) {
        this.oxid = oxid;
        this.order = order;
        this.shangHu = shangHu;
        this.user = user;
        this.oxprice = oxprice;
        this.oxcount = oxcount;
    }
}
