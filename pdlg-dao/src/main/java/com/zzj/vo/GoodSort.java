package com.zzj.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties("handler")
public class GoodSort implements Serializable {
    private int gsid;
    private GoodBigSort goodBigSort;
    private GoodSmallsort goodSmallsort;


    public GoodSort() {
    }

    @Override
    public String toString() {
        return "GoodSort{" +
                "gsid=" + gsid +
                ", goodBigSort=" + goodBigSort +
                ", goodSmallsort=" + goodSmallsort +
                '}';
    }

    public int getGsid() {
        return gsid;
    }

    public void setGsid(int gsid) {
        this.gsid = gsid;
    }

    public GoodBigSort getGoodBigSort() {
        return goodBigSort;
    }

    public void setGoodBigSort(GoodBigSort goodBigSort) {
        this.goodBigSort = goodBigSort;
    }

    public GoodSmallsort getGoodSmallsort() {
        return goodSmallsort;
    }

    public void setGoodSmallsort(GoodSmallsort goodSmallsort) {
        this.goodSmallsort = goodSmallsort;
    }

    public GoodSort(int gsid, GoodBigSort goodBigSort, GoodSmallsort goodSmallsort) {
        this.gsid = gsid;
        this.goodBigSort = goodBigSort;
        this.goodSmallsort = goodSmallsort;
    }
}
