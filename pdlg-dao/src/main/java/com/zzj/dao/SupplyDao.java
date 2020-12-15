package com.zzj.dao;

import com.zzj.vo.Supply;

import java.util.List;

public interface SupplyDao {
    //根据上架表查询
    public Supply querySupplyByglid(int glid);
    //添加供货
    public int addSupplyBywidgid(List<Supply> supplyList);
    //删除供货
    public int deleteSupplyBywid(int wid);
}
